package xyz.iwolfking.woldsvaults.configs;

import com.google.gson.annotations.Expose;
import iskallia.vault.config.Config;
import iskallia.vault.config.entry.vending.ProductEntry;
import iskallia.vault.util.data.WeightedList;
import net.minecraft.world.item.Items;
import xyz.iwolfking.vhapi.api.lib.core.readers.CustomVaultConfigReader;
import xyz.iwolfking.vhapi.api.util.JsonUtils;

import java.io.IOException;
import java.io.InputStream;

public class OmegaBoxConfig extends Config {
    @Expose
    public WeightedList<ProductEntry> POOL = new WeightedList();

    public String getName() {
        /* 14 */     return "omega_box";
        /*    */   }

    protected void reset() {
        try (InputStream stream = this.getClass().getResourceAsStream("/default_configs/omega_box.json")) {
            CustomVaultConfigReader<OmegaBoxConfig> reader = new CustomVaultConfigReader<>();
            if(stream == null) {
                throw new IOException();
            }
            this.POOL = reader.readCustomConfig("omega_box", JsonUtils.parseJsonContentFromStream(stream), OmegaBoxConfig.class).POOL;
        } catch (IOException e) {
            System.out.println("Failed to read default Omega Box config...");
            this.POOL.add(new ProductEntry(Items.APPLE, 8, null), 3);
            this.POOL.add(new ProductEntry(Items.GOLDEN_APPLE, 1, null), 1);
            throw new RuntimeException(e);
        }
    }
}

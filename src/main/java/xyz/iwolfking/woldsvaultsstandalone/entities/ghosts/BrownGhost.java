package xyz.iwolfking.woldsvaultsstandalone.entities.ghosts;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import vazkii.quark.content.mobs.entity.Wraith;
import xyz.iwolfking.woldsvaultsstandalone.WoldsVaults;
import xyz.iwolfking.woldsvaultsstandalone.entities.ghosts.lib.VaultModifierWraith;

public class BrownGhost extends VaultModifierWraith {
    public BrownGhost(EntityType<? extends Wraith> type, Level worldIn) {
        super(type, worldIn, WoldsVaults.id("brown_ghost"));
    }
}

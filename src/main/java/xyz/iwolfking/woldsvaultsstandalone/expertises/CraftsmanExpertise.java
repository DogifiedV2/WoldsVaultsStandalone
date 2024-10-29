package xyz.iwolfking.woldsvaultsstandalone.expertises;

import com.google.gson.JsonObject;
import iskallia.vault.core.data.adapter.Adapters;
import iskallia.vault.core.net.BitBuffer;
import iskallia.vault.skill.base.LearnableSkill;
import net.minecraft.nbt.CompoundTag;

import java.util.Optional;

public class CraftsmanExpertise extends LearnableSkill {

    private int craftsmanLevel;

    public CraftsmanExpertise() {
    }

    public void writeBits(BitBuffer buffer) {
        super.writeBits(buffer);
        Adapters.INT.writeBits(this.craftsmanLevel, buffer);
    }

    public void readBits(BitBuffer buffer) {
        super.readBits(buffer);
        this.craftsmanLevel = (Integer)Adapters.INT.readBits(buffer).orElseThrow();
    }
    public Optional<CompoundTag> writeNbt() {
        return super.writeNbt().map((nbt) -> {
            Adapters.INT.writeNbt(this.craftsmanLevel).ifPresent((tag) -> {
                nbt.put("craftsmanLevel", tag);
            });
            return nbt;
        });
    }

    public void readNbt(CompoundTag nbt) {
        super.readNbt(nbt);
        this.craftsmanLevel = (Integer)Adapters.INT.readNbt(nbt.get("craftsmanLevel")).orElseThrow();
    }

    public Optional<JsonObject> writeJson() {
        return super.writeJson().map((json) -> {
            Adapters.INT.writeJson(this.craftsmanLevel).ifPresent((element) -> {
                json.add("craftsmanLevel", element);
            });
            return json;
        });
    }

    public void readJson(JsonObject json) {
        super.readJson(json);
        this.craftsmanLevel = (Integer)Adapters.INT.readJson(json.get("craftsmanLevel")).orElseThrow();
    }

    public int getCraftsmanLevel() {
        return this.craftsmanLevel;
    }
}

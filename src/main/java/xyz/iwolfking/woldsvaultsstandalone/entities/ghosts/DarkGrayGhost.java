package xyz.iwolfking.woldsvaultsstandalone.entities.ghosts;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import vazkii.quark.content.mobs.entity.Wraith;
import xyz.iwolfking.woldsvaultsstandalone.entities.ghosts.lib.GenericWraith;

public class DarkGrayGhost extends GenericWraith {
    public DarkGrayGhost(EntityType<? extends Wraith> type, Level worldIn) {
        super(type, worldIn);
    }
}

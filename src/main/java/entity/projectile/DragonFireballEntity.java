package yarnwrap.entity.projectile;
public class DragonFireballEntity { public net.minecraft.entity.projectile.DragonFireballEntity wrapperContained; public DragonFireballEntity(net.minecraft.entity.projectile.DragonFireballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float DAMAGE_RANGE() { return wrapperContained.DAMAGE_RANGE; }

}
package yarnwrap.entity.projectile;
public class LlamaSpitEntity { public net.minecraft.entity.projectile.LlamaSpitEntity wrapperContained; public LlamaSpitEntity(net.minecraft.entity.projectile.LlamaSpitEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public LlamaSpitEntity(yarnwrap.world.World world,yarnwrap.entity.passive.LlamaEntity owner) { this.wrapperContained = new net.minecraft.entity.projectile.LlamaSpitEntity(world.wrapperContained,owner.wrapperContained); }

}
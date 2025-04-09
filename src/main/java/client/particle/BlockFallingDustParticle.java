package yarnwrap.client.particle;
public class BlockFallingDustParticle { public net.minecraft.client.particle.BlockFallingDustParticle wrapperContained; public BlockFallingDustParticle(net.minecraft.client.particle.BlockFallingDustParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public float rotationSpeed() { return wrapperContained.rotationSpeed; }

}
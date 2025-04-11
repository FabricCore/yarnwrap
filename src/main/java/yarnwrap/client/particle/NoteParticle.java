package yarnwrap.client.particle;
public class NoteParticle { public net.minecraft.client.particle.NoteParticle wrapperContained; public NoteParticle(net.minecraft.client.particle.NoteParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public NoteParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z) { this.wrapperContained = new net.minecraft.client.particle.NoteParticle(world.wrapperContained,x,y,z); }

}
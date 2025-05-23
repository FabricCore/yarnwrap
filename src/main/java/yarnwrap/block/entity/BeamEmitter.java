package yarnwrap.block.entity;
public class BeamEmitter { public net.minecraft.block.entity.BeamEmitter wrapperContained; public BeamEmitter(net.minecraft.block.entity.BeamEmitter wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List getBeamSegments() { return wrapperContained.getBeamSegments(); }
// public static java.util.List getBeamSegments() { return net.minecraft.block.entity.BeamEmitter.getBeamSegments(); }

}
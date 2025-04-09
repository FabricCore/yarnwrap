package yarnwrap.world.gen.structure;
public class Structures { public net.minecraft.world.gen.structure.Structures wrapperContained; public Structures(net.minecraft.world.gen.structure.Structures wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable structureRegisterable) { wrapperContained.bootstrap(structureRegisterable.wrapperContained); }

}
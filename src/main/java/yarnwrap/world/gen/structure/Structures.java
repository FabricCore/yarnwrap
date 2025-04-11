package yarnwrap.world.gen.structure;
public class Structures { public net.minecraft.world.gen.structure.Structures wrapperContained; public Structures(net.minecraft.world.gen.structure.Structures wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable structureRegisterable) { wrapperContained.bootstrap(structureRegisterable.wrapperContained); }
// public yarnwrap.world.StructureSpawns method_46847(yarnwrap.entity.SpawnGroup spawnGroup) { return new yarnwrap.world.StructureSpawns(wrapperContained.method_46847(spawnGroup.wrapperContained)); }
// public yarnwrap.entity.SpawnGroup method_46848(yarnwrap.entity.SpawnGroup spawnGroup) { return new yarnwrap.entity.SpawnGroup(wrapperContained.method_46848(spawnGroup.wrapperContained)); }
// public yarnwrap.world.StructureSpawns method_60421(yarnwrap.entity.SpawnGroup spawnGroup) { return new yarnwrap.world.StructureSpawns(wrapperContained.method_60421(spawnGroup.wrapperContained)); }
// public yarnwrap.entity.SpawnGroup method_60422(yarnwrap.entity.SpawnGroup spawnGroup) { return new yarnwrap.entity.SpawnGroup(wrapperContained.method_60422(spawnGroup.wrapperContained)); }

}
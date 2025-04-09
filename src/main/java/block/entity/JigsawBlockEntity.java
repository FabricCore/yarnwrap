package yarnwrap.block.entity;
public class JigsawBlockEntity { public net.minecraft.block.entity.JigsawBlockEntity wrapperContained; public JigsawBlockEntity(net.minecraft.block.entity.JigsawBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
// public java.lang.String finalState() { return wrapperContained.finalState; }
// public yarnwrap.util.Identifier target() { return new yarnwrap.util.Identifier(wrapperContained.target); }
// public yarnwrap.registry.RegistryKey pool() { return new yarnwrap.registry.RegistryKey(wrapperContained.pool); }
// public Object joint() { return wrapperContained.joint; }
public java.lang.String TARGET_KEY() { return wrapperContained.TARGET_KEY; }
public java.lang.String POOL_KEY() { return wrapperContained.POOL_KEY; }
public java.lang.String JOINT_KEY() { return wrapperContained.JOINT_KEY; }
public java.lang.String NAME_KEY() { return wrapperContained.NAME_KEY; }
public java.lang.String FINAL_STATE_KEY() { return wrapperContained.FINAL_STATE_KEY; }
public java.lang.String PLACEMENT_PRIORITY_KEY() { return wrapperContained.PLACEMENT_PRIORITY_KEY; }
public java.lang.String SELECTION_PRIORITY_KEY() { return wrapperContained.SELECTION_PRIORITY_KEY; }
// public int placementPriority() { return wrapperContained.placementPriority; }
// public int selectionPriority() { return wrapperContained.selectionPriority; }
public void setFinalState(java.lang.String finalState) { wrapperContained.setFinalState(finalState); }
public void setTarget(yarnwrap.util.Identifier target) { wrapperContained.setTarget(target.wrapperContained); }
public void setName(yarnwrap.util.Identifier name) { wrapperContained.setName(name.wrapperContained); }
public java.lang.String getFinalState() { return wrapperContained.getFinalState(); }
public yarnwrap.util.Identifier getName() { return new yarnwrap.util.Identifier(wrapperContained.getName()); }
public yarnwrap.registry.RegistryKey getPool() { return new yarnwrap.registry.RegistryKey(wrapperContained.getPool()); }
// public void setJoint(Object joint) { wrapperContained.setJoint(joint); }
public void setPool(yarnwrap.registry.RegistryKey pool) { wrapperContained.setPool(pool.wrapperContained); }
public yarnwrap.util.Identifier getTarget() { return new yarnwrap.util.Identifier(wrapperContained.getTarget()); }
public Object getJoint() { return wrapperContained.getJoint(); }
public void generate(yarnwrap.server.world.ServerWorld world,int maxDepth,boolean keepJigsaws) { wrapperContained.generate(world.wrapperContained,maxDepth,keepJigsaws); }
public void setPlacementPriority(int placementPriority) { wrapperContained.setPlacementPriority(placementPriority); }
public void setSelectionPriority(int selectionPriority) { wrapperContained.setSelectionPriority(selectionPriority); }
public int getPlacementPriority() { return wrapperContained.getPlacementPriority(); }
public int getSelectionPriority() { return wrapperContained.getSelectionPriority(); }

}
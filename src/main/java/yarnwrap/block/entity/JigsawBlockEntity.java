package yarnwrap.block.entity;
public class JigsawBlockEntity { public net.minecraft.block.entity.JigsawBlockEntity wrapperContained; public JigsawBlockEntity(net.minecraft.block.entity.JigsawBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
// public void name(yarnwrap.util.Identifier value) { wrapperContained.name = value.wrapperContained; }
// public java.lang.String finalState() { return wrapperContained.finalState; }
// public void finalState(java.lang.String value) { wrapperContained.finalState = value; }
// public yarnwrap.util.Identifier target() { return new yarnwrap.util.Identifier(wrapperContained.target); }
// public void target(yarnwrap.util.Identifier value) { wrapperContained.target = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey pool() { return new yarnwrap.registry.RegistryKey(wrapperContained.pool); }
// public void pool(yarnwrap.registry.RegistryKey value) { wrapperContained.pool = value.wrapperContained; }
// public Object joint() { return wrapperContained.joint; }
// // public void joint(Object value) { wrapperContained.joint = value; }
public java.lang.String TARGET_KEY() { return wrapperContained.TARGET_KEY; }
// public void TARGET_KEY(java.lang.String value) { wrapperContained.TARGET_KEY = value; }
public java.lang.String POOL_KEY() { return wrapperContained.POOL_KEY; }
// public void POOL_KEY(java.lang.String value) { wrapperContained.POOL_KEY = value; }
public java.lang.String JOINT_KEY() { return wrapperContained.JOINT_KEY; }
// public void JOINT_KEY(java.lang.String value) { wrapperContained.JOINT_KEY = value; }
public java.lang.String NAME_KEY() { return wrapperContained.NAME_KEY; }
// public void NAME_KEY(java.lang.String value) { wrapperContained.NAME_KEY = value; }
public java.lang.String FINAL_STATE_KEY() { return wrapperContained.FINAL_STATE_KEY; }
// public void FINAL_STATE_KEY(java.lang.String value) { wrapperContained.FINAL_STATE_KEY = value; }
public java.lang.String PLACEMENT_PRIORITY_KEY() { return wrapperContained.PLACEMENT_PRIORITY_KEY; }
// public void PLACEMENT_PRIORITY_KEY(java.lang.String value) { wrapperContained.PLACEMENT_PRIORITY_KEY = value; }
public java.lang.String SELECTION_PRIORITY_KEY() { return wrapperContained.SELECTION_PRIORITY_KEY; }
// public void SELECTION_PRIORITY_KEY(java.lang.String value) { wrapperContained.SELECTION_PRIORITY_KEY = value; }
// public int placementPriority() { return wrapperContained.placementPriority; }
// public void placementPriority(int value) { wrapperContained.placementPriority = value; }
// public int selectionPriority() { return wrapperContained.selectionPriority; }
// public void selectionPriority(int value) { wrapperContained.selectionPriority = value; }
public JigsawBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.JigsawBlockEntity(pos.wrapperContained,state.wrapperContained); }
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
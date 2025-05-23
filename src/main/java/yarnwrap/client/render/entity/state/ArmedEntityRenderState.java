package yarnwrap.client.render.entity.state;
public class ArmedEntityRenderState { public net.minecraft.client.render.entity.state.ArmedEntityRenderState wrapperContained; public ArmedEntityRenderState(net.minecraft.client.render.entity.state.ArmedEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Arm mainArm() { return new yarnwrap.util.Arm(wrapperContained.mainArm); }
public void mainArm(yarnwrap.util.Arm value) { wrapperContained.mainArm = value.wrapperContained; }
// public static yarnwrap.util.Arm mainArm() { return new yarnwrap.util.Arm(net.minecraft.client.render.entity.state.ArmedEntityRenderState.mainArm); }
// public static void mainArm(yarnwrap.util.Arm value, ) { net.minecraft.client.render.entity.state.ArmedEntityRenderState.mainArm = value.wrapperContained; }

public Object rightArmPose() { return wrapperContained.rightArmPose; }
// public void rightArmPose(Object value) { wrapperContained.rightArmPose = value; }
// // public static Object rightArmPose() { return net.minecraft.client.render.entity.state.ArmedEntityRenderState.rightArmPose; }
// // public static void rightArmPose(Object value, ) { net.minecraft.client.render.entity.state.ArmedEntityRenderState.rightArmPose = value; }

public yarnwrap.client.render.item.ItemRenderState rightHandItemState() { return new yarnwrap.client.render.item.ItemRenderState(wrapperContained.rightHandItemState); }
// public void rightHandItemState(yarnwrap.client.render.item.ItemRenderState value) { wrapperContained.rightHandItemState = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderState rightHandItemState() { return new yarnwrap.client.render.item.ItemRenderState(net.minecraft.client.render.entity.state.ArmedEntityRenderState.rightHandItemState); }
// public static void rightHandItemState(yarnwrap.client.render.item.ItemRenderState value, ) { net.minecraft.client.render.entity.state.ArmedEntityRenderState.rightHandItemState = value.wrapperContained; }

public Object leftArmPose() { return wrapperContained.leftArmPose; }
// public void leftArmPose(Object value) { wrapperContained.leftArmPose = value; }
// // public static Object leftArmPose() { return net.minecraft.client.render.entity.state.ArmedEntityRenderState.leftArmPose; }
// // public static void leftArmPose(Object value, ) { net.minecraft.client.render.entity.state.ArmedEntityRenderState.leftArmPose = value; }

public yarnwrap.client.render.item.ItemRenderState leftHandItemState() { return new yarnwrap.client.render.item.ItemRenderState(wrapperContained.leftHandItemState); }
// public void leftHandItemState(yarnwrap.client.render.item.ItemRenderState value) { wrapperContained.leftHandItemState = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderState leftHandItemState() { return new yarnwrap.client.render.item.ItemRenderState(net.minecraft.client.render.entity.state.ArmedEntityRenderState.leftHandItemState); }
// public static void leftHandItemState(yarnwrap.client.render.item.ItemRenderState value, ) { net.minecraft.client.render.entity.state.ArmedEntityRenderState.leftHandItemState = value.wrapperContained; }

// public void updateRenderState(yarnwrap.entity.LivingEntity entity,yarnwrap.client.render.entity.state.ArmedEntityRenderState state,yarnwrap.client.item.ItemModelManager itemModelManager) { wrapperContained.updateRenderState(entity.wrapperContained,state.wrapperContained,itemModelManager.wrapperContained); }
// public static void updateRenderState(yarnwrap.entity.LivingEntity entity,yarnwrap.client.render.entity.state.ArmedEntityRenderState state,yarnwrap.client.item.ItemModelManager itemModelManager, ) { net.minecraft.client.render.entity.state.ArmedEntityRenderState.updateRenderState(entity.wrapperContained,state.wrapperContained,itemModelManager.wrapperContained); }
public yarnwrap.client.render.item.ItemRenderState getMainHandItemState() { return new yarnwrap.client.render.item.ItemRenderState(wrapperContained.getMainHandItemState()); }
// public static yarnwrap.client.render.item.ItemRenderState getMainHandItemState() { return new yarnwrap.client.render.item.ItemRenderState(net.minecraft.client.render.entity.state.ArmedEntityRenderState.getMainHandItemState()); }

}
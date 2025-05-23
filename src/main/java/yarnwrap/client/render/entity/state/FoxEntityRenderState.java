package yarnwrap.client.render.entity.state;
public class FoxEntityRenderState { public net.minecraft.client.render.entity.state.FoxEntityRenderState wrapperContained; public FoxEntityRenderState(net.minecraft.client.render.entity.state.FoxEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float headRoll() { return wrapperContained.headRoll; }
public void headRoll(float value) { wrapperContained.headRoll = value; }
// public static float headRoll() { return net.minecraft.client.render.entity.state.FoxEntityRenderState.headRoll; }
// public static void headRoll(float value, ) { net.minecraft.client.render.entity.state.FoxEntityRenderState.headRoll = value; }

public float bodyRotationHeightOffset() { return wrapperContained.bodyRotationHeightOffset; }
public void bodyRotationHeightOffset(float value) { wrapperContained.bodyRotationHeightOffset = value; }
// public static float bodyRotationHeightOffset() { return net.minecraft.client.render.entity.state.FoxEntityRenderState.bodyRotationHeightOffset; }
// public static void bodyRotationHeightOffset(float value, ) { net.minecraft.client.render.entity.state.FoxEntityRenderState.bodyRotationHeightOffset = value; }

public boolean inSneakingPose() { return wrapperContained.inSneakingPose; }
public void inSneakingPose(boolean value) { wrapperContained.inSneakingPose = value; }
// public static boolean inSneakingPose() { return net.minecraft.client.render.entity.state.FoxEntityRenderState.inSneakingPose; }
// public static void inSneakingPose(boolean value, ) { net.minecraft.client.render.entity.state.FoxEntityRenderState.inSneakingPose = value; }

public boolean sleeping() { return wrapperContained.sleeping; }
public void sleeping(boolean value) { wrapperContained.sleeping = value; }
// public static boolean sleeping() { return net.minecraft.client.render.entity.state.FoxEntityRenderState.sleeping; }
// public static void sleeping(boolean value, ) { net.minecraft.client.render.entity.state.FoxEntityRenderState.sleeping = value; }

public boolean sitting() { return wrapperContained.sitting; }
public void sitting(boolean value) { wrapperContained.sitting = value; }
// public static boolean sitting() { return net.minecraft.client.render.entity.state.FoxEntityRenderState.sitting; }
// public static void sitting(boolean value, ) { net.minecraft.client.render.entity.state.FoxEntityRenderState.sitting = value; }

public boolean walking() { return wrapperContained.walking; }
public void walking(boolean value) { wrapperContained.walking = value; }
// public static boolean walking() { return net.minecraft.client.render.entity.state.FoxEntityRenderState.walking; }
// public static void walking(boolean value, ) { net.minecraft.client.render.entity.state.FoxEntityRenderState.walking = value; }

public boolean chasing() { return wrapperContained.chasing; }
public void chasing(boolean value) { wrapperContained.chasing = value; }
// public static boolean chasing() { return net.minecraft.client.render.entity.state.FoxEntityRenderState.chasing; }
// public static void chasing(boolean value, ) { net.minecraft.client.render.entity.state.FoxEntityRenderState.chasing = value; }

public Object type() { return wrapperContained.type; }
// public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.client.render.entity.state.FoxEntityRenderState.type; }
// // public static void type(Object value, ) { net.minecraft.client.render.entity.state.FoxEntityRenderState.type = value; }


}
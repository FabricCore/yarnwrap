package yarnwrap.client.render.entity.state;
public class RabbitEntityRenderState { public net.minecraft.client.render.entity.state.RabbitEntityRenderState wrapperContained; public RabbitEntityRenderState(net.minecraft.client.render.entity.state.RabbitEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float jumpProgress() { return wrapperContained.jumpProgress; }
public void jumpProgress(float value) { wrapperContained.jumpProgress = value; }
// public static float jumpProgress() { return net.minecraft.client.render.entity.state.RabbitEntityRenderState.jumpProgress; }
// public static void jumpProgress(float value, ) { net.minecraft.client.render.entity.state.RabbitEntityRenderState.jumpProgress = value; }

public boolean isToast() { return wrapperContained.isToast; }
public void isToast(boolean value) { wrapperContained.isToast = value; }
// public static boolean isToast() { return net.minecraft.client.render.entity.state.RabbitEntityRenderState.isToast; }
// public static void isToast(boolean value, ) { net.minecraft.client.render.entity.state.RabbitEntityRenderState.isToast = value; }

public Object type() { return wrapperContained.type; }
// public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.client.render.entity.state.RabbitEntityRenderState.type; }
// // public static void type(Object value, ) { net.minecraft.client.render.entity.state.RabbitEntityRenderState.type = value; }


}
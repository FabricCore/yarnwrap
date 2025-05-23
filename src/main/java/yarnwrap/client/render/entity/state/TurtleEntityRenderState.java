package yarnwrap.client.render.entity.state;
public class TurtleEntityRenderState { public net.minecraft.client.render.entity.state.TurtleEntityRenderState wrapperContained; public TurtleEntityRenderState(net.minecraft.client.render.entity.state.TurtleEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean onLand() { return wrapperContained.onLand; }
public void onLand(boolean value) { wrapperContained.onLand = value; }
// public static boolean onLand() { return net.minecraft.client.render.entity.state.TurtleEntityRenderState.onLand; }
// public static void onLand(boolean value, ) { net.minecraft.client.render.entity.state.TurtleEntityRenderState.onLand = value; }

public boolean diggingSand() { return wrapperContained.diggingSand; }
public void diggingSand(boolean value) { wrapperContained.diggingSand = value; }
// public static boolean diggingSand() { return net.minecraft.client.render.entity.state.TurtleEntityRenderState.diggingSand; }
// public static void diggingSand(boolean value, ) { net.minecraft.client.render.entity.state.TurtleEntityRenderState.diggingSand = value; }

public boolean hasEgg() { return wrapperContained.hasEgg; }
public void hasEgg(boolean value) { wrapperContained.hasEgg = value; }
// public static boolean hasEgg() { return net.minecraft.client.render.entity.state.TurtleEntityRenderState.hasEgg; }
// public static void hasEgg(boolean value, ) { net.minecraft.client.render.entity.state.TurtleEntityRenderState.hasEgg = value; }


}
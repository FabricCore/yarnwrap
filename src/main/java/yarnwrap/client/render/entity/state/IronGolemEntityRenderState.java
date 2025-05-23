package yarnwrap.client.render.entity.state;
public class IronGolemEntityRenderState { public net.minecraft.client.render.entity.state.IronGolemEntityRenderState wrapperContained; public IronGolemEntityRenderState(net.minecraft.client.render.entity.state.IronGolemEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float attackTicksLeft() { return wrapperContained.attackTicksLeft; }
public void attackTicksLeft(float value) { wrapperContained.attackTicksLeft = value; }
// public static float attackTicksLeft() { return net.minecraft.client.render.entity.state.IronGolemEntityRenderState.attackTicksLeft; }
// public static void attackTicksLeft(float value, ) { net.minecraft.client.render.entity.state.IronGolemEntityRenderState.attackTicksLeft = value; }

public int lookingAtVillagerTicks() { return wrapperContained.lookingAtVillagerTicks; }
public void lookingAtVillagerTicks(int value) { wrapperContained.lookingAtVillagerTicks = value; }
// public static int lookingAtVillagerTicks() { return net.minecraft.client.render.entity.state.IronGolemEntityRenderState.lookingAtVillagerTicks; }
// public static void lookingAtVillagerTicks(int value, ) { net.minecraft.client.render.entity.state.IronGolemEntityRenderState.lookingAtVillagerTicks = value; }

public Object crackLevel() { return wrapperContained.crackLevel; }
// public void crackLevel(Object value) { wrapperContained.crackLevel = value; }
// // public static Object crackLevel() { return net.minecraft.client.render.entity.state.IronGolemEntityRenderState.crackLevel; }
// // public static void crackLevel(Object value, ) { net.minecraft.client.render.entity.state.IronGolemEntityRenderState.crackLevel = value; }


}
package yarnwrap.client.render.entity.state;
public class PlayerEntityRenderState { public net.minecraft.client.render.entity.state.PlayerEntityRenderState wrapperContained; public PlayerEntityRenderState(net.minecraft.client.render.entity.state.PlayerEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.util.SkinTextures skinTextures() { return new yarnwrap.client.util.SkinTextures(wrapperContained.skinTextures); }
public void skinTextures(yarnwrap.client.util.SkinTextures value) { wrapperContained.skinTextures = value.wrapperContained; }
// public static yarnwrap.client.util.SkinTextures skinTextures() { return new yarnwrap.client.util.SkinTextures(net.minecraft.client.render.entity.state.PlayerEntityRenderState.skinTextures); }
// public static void skinTextures(yarnwrap.client.util.SkinTextures value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.skinTextures = value.wrapperContained; }

public float flyingRotation() { return wrapperContained.flyingRotation; }
public void flyingRotation(float value) { wrapperContained.flyingRotation = value; }
// public static float flyingRotation() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.flyingRotation; }
// public static void flyingRotation(float value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.flyingRotation = value; }

public boolean handSwinging() { return wrapperContained.handSwinging; }
public void handSwinging(boolean value) { wrapperContained.handSwinging = value; }
// public static boolean handSwinging() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.handSwinging; }
// public static void handSwinging(boolean value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.handSwinging = value; }

public yarnwrap.text.Text playerName() { return new yarnwrap.text.Text(wrapperContained.playerName); }
public void playerName(yarnwrap.text.Text value) { wrapperContained.playerName = value.wrapperContained; }
// public static yarnwrap.text.Text playerName() { return new yarnwrap.text.Text(net.minecraft.client.render.entity.state.PlayerEntityRenderState.playerName); }
// public static void playerName(yarnwrap.text.Text value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.playerName = value.wrapperContained; }

public Object leftShoulderParrotVariant() { return wrapperContained.leftShoulderParrotVariant; }
// public void leftShoulderParrotVariant(Object value) { wrapperContained.leftShoulderParrotVariant = value; }
// // public static Object leftShoulderParrotVariant() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.leftShoulderParrotVariant; }
// // public static void leftShoulderParrotVariant(Object value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.leftShoulderParrotVariant = value; }

public Object rightShoulderParrotVariant() { return wrapperContained.rightShoulderParrotVariant; }
// public void rightShoulderParrotVariant(Object value) { wrapperContained.rightShoulderParrotVariant = value; }
// // public static Object rightShoulderParrotVariant() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.rightShoulderParrotVariant; }
// // public static void rightShoulderParrotVariant(Object value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.rightShoulderParrotVariant = value; }

public int id() { return wrapperContained.id; }
public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.id; }
// public static void id(int value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.id = value; }

public java.lang.String name() { return wrapperContained.name; }
public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.name = value; }

public boolean leftSleeveVisible() { return wrapperContained.leftSleeveVisible; }
public void leftSleeveVisible(boolean value) { wrapperContained.leftSleeveVisible = value; }
// public static boolean leftSleeveVisible() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.leftSleeveVisible; }
// public static void leftSleeveVisible(boolean value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.leftSleeveVisible = value; }

public boolean rightSleeveVisible() { return wrapperContained.rightSleeveVisible; }
public void rightSleeveVisible(boolean value) { wrapperContained.rightSleeveVisible = value; }
// public static boolean rightSleeveVisible() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.rightSleeveVisible; }
// public static void rightSleeveVisible(boolean value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.rightSleeveVisible = value; }

public boolean capeVisible() { return wrapperContained.capeVisible; }
public void capeVisible(boolean value) { wrapperContained.capeVisible = value; }
// public static boolean capeVisible() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.capeVisible; }
// public static void capeVisible(boolean value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.capeVisible = value; }

public float glidingTicks() { return wrapperContained.glidingTicks; }
public void glidingTicks(float value) { wrapperContained.glidingTicks = value; }
// public static float glidingTicks() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.glidingTicks; }
// public static void glidingTicks(float value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.glidingTicks = value; }

public boolean applyFlyingRotation() { return wrapperContained.applyFlyingRotation; }
public void applyFlyingRotation(boolean value) { wrapperContained.applyFlyingRotation = value; }
// public static boolean applyFlyingRotation() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.applyFlyingRotation; }
// public static void applyFlyingRotation(boolean value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.applyFlyingRotation = value; }

public int stuckArrowCount() { return wrapperContained.stuckArrowCount; }
public void stuckArrowCount(int value) { wrapperContained.stuckArrowCount = value; }
// public static int stuckArrowCount() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.stuckArrowCount; }
// public static void stuckArrowCount(int value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.stuckArrowCount = value; }

public int stingerCount() { return wrapperContained.stingerCount; }
public void stingerCount(int value) { wrapperContained.stingerCount = value; }
// public static int stingerCount() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.stingerCount; }
// public static void stingerCount(int value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.stingerCount = value; }

public int itemUseTimeLeft() { return wrapperContained.itemUseTimeLeft; }
public void itemUseTimeLeft(int value) { wrapperContained.itemUseTimeLeft = value; }
// public static int itemUseTimeLeft() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.itemUseTimeLeft; }
// public static void itemUseTimeLeft(int value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.itemUseTimeLeft = value; }

public boolean spectator() { return wrapperContained.spectator; }
public void spectator(boolean value) { wrapperContained.spectator = value; }
// public static boolean spectator() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.spectator; }
// public static void spectator(boolean value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.spectator = value; }

public boolean hatVisible() { return wrapperContained.hatVisible; }
public void hatVisible(boolean value) { wrapperContained.hatVisible = value; }
// public static boolean hatVisible() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.hatVisible; }
// public static void hatVisible(boolean value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.hatVisible = value; }

public boolean jacketVisible() { return wrapperContained.jacketVisible; }
public void jacketVisible(boolean value) { wrapperContained.jacketVisible = value; }
// public static boolean jacketVisible() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.jacketVisible; }
// public static void jacketVisible(boolean value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.jacketVisible = value; }

public boolean leftPantsLegVisible() { return wrapperContained.leftPantsLegVisible; }
public void leftPantsLegVisible(boolean value) { wrapperContained.leftPantsLegVisible = value; }
// public static boolean leftPantsLegVisible() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.leftPantsLegVisible; }
// public static void leftPantsLegVisible(boolean value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.leftPantsLegVisible = value; }

public boolean rightPantsLegVisible() { return wrapperContained.rightPantsLegVisible; }
public void rightPantsLegVisible(boolean value) { wrapperContained.rightPantsLegVisible = value; }
// public static boolean rightPantsLegVisible() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.rightPantsLegVisible; }
// public static void rightPantsLegVisible(boolean value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.rightPantsLegVisible = value; }

public yarnwrap.client.render.item.ItemRenderState spyglassState() { return new yarnwrap.client.render.item.ItemRenderState(wrapperContained.spyglassState); }
// public void spyglassState(yarnwrap.client.render.item.ItemRenderState value) { wrapperContained.spyglassState = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderState spyglassState() { return new yarnwrap.client.render.item.ItemRenderState(net.minecraft.client.render.entity.state.PlayerEntityRenderState.spyglassState); }
// public static void spyglassState(yarnwrap.client.render.item.ItemRenderState value, ) { net.minecraft.client.render.entity.state.PlayerEntityRenderState.spyglassState = value.wrapperContained; }

public float getGlidingProgress() { return wrapperContained.getGlidingProgress(); }
// public static float getGlidingProgress() { return net.minecraft.client.render.entity.state.PlayerEntityRenderState.getGlidingProgress(); }

}
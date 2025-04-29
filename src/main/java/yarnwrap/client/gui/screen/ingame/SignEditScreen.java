package yarnwrap.client.gui.screen.ingame;
public class SignEditScreen { public net.minecraft.client.gui.screen.ingame.SignEditScreen wrapperContained; public SignEditScreen(net.minecraft.client.gui.screen.ingame.SignEditScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object model() { return wrapperContained.model; }
// // public void model(Object value) { wrapperContained.model = value; }
// // public static Object model() { return net.minecraft.client.gui.screen.ingame.SignEditScreen.model; }
// // public static void model(Object value, ) { net.minecraft.client.gui.screen.ingame.SignEditScreen.model = value; }

// public float BACKGROUND_SCALE() { return wrapperContained.BACKGROUND_SCALE; }
// public void BACKGROUND_SCALE(float value) { wrapperContained.BACKGROUND_SCALE = value; }
public static float BACKGROUND_SCALE() { return net.minecraft.client.gui.screen.ingame.SignEditScreen.BACKGROUND_SCALE; }
// public static void BACKGROUND_SCALE(float value, ) { net.minecraft.client.gui.screen.ingame.SignEditScreen.BACKGROUND_SCALE = value; }

// public float TEXT_SCALE_MULTIPLIER() { return wrapperContained.TEXT_SCALE_MULTIPLIER; }
// public void TEXT_SCALE_MULTIPLIER(float value) { wrapperContained.TEXT_SCALE_MULTIPLIER = value; }
public static float TEXT_SCALE_MULTIPLIER() { return net.minecraft.client.gui.screen.ingame.SignEditScreen.TEXT_SCALE_MULTIPLIER; }
// public static void TEXT_SCALE_MULTIPLIER(float value, ) { net.minecraft.client.gui.screen.ingame.SignEditScreen.TEXT_SCALE_MULTIPLIER = value; }

// public org.joml.Vector3f TEXT_SCALE() { return wrapperContained.TEXT_SCALE; }
// public void TEXT_SCALE(org.joml.Vector3f value) { wrapperContained.TEXT_SCALE = value; }
// public static org.joml.Vector3f TEXT_SCALE() { return net.minecraft.client.gui.screen.ingame.SignEditScreen.TEXT_SCALE; }
// public static void TEXT_SCALE(org.joml.Vector3f value, ) { net.minecraft.client.gui.screen.ingame.SignEditScreen.TEXT_SCALE = value; }

// public SignEditScreen(yarnwrap.block.entity.SignBlockEntity sign,boolean filtered) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.SignEditScreen(sign.wrapperContained,filtered); }

}
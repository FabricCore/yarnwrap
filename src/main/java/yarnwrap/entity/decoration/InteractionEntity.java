package yarnwrap.entity.decoration;
public class InteractionEntity { public net.minecraft.entity.decoration.InteractionEntity wrapperContained; public InteractionEntity(net.minecraft.entity.decoration.InteractionEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.decoration.InteractionEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.decoration.InteractionEntity.LOGGER = value; }

// public yarnwrap.entity.data.TrackedData WIDTH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.WIDTH); }
// public void WIDTH(yarnwrap.entity.data.TrackedData value) { wrapperContained.WIDTH = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData WIDTH() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.decoration.InteractionEntity.WIDTH); }
// public static void WIDTH(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.decoration.InteractionEntity.WIDTH = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData HEIGHT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HEIGHT); }
// public void HEIGHT(yarnwrap.entity.data.TrackedData value) { wrapperContained.HEIGHT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData HEIGHT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.decoration.InteractionEntity.HEIGHT); }
// public static void HEIGHT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.decoration.InteractionEntity.HEIGHT = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData RESPONSE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RESPONSE); }
// public void RESPONSE(yarnwrap.entity.data.TrackedData value) { wrapperContained.RESPONSE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData RESPONSE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.decoration.InteractionEntity.RESPONSE); }
// public static void RESPONSE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.decoration.InteractionEntity.RESPONSE = value.wrapperContained; }

// public java.lang.String WIDTH_KEY() { return wrapperContained.WIDTH_KEY; }
// public void WIDTH_KEY(java.lang.String value) { wrapperContained.WIDTH_KEY = value; }
// public static java.lang.String WIDTH_KEY() { return net.minecraft.entity.decoration.InteractionEntity.WIDTH_KEY; }
// public static void WIDTH_KEY(java.lang.String value, ) { net.minecraft.entity.decoration.InteractionEntity.WIDTH_KEY = value; }

// public java.lang.String HEIGHT_KEY() { return wrapperContained.HEIGHT_KEY; }
// public void HEIGHT_KEY(java.lang.String value) { wrapperContained.HEIGHT_KEY = value; }
// public static java.lang.String HEIGHT_KEY() { return net.minecraft.entity.decoration.InteractionEntity.HEIGHT_KEY; }
// public static void HEIGHT_KEY(java.lang.String value, ) { net.minecraft.entity.decoration.InteractionEntity.HEIGHT_KEY = value; }

// public java.lang.String ATTACK_KEY() { return wrapperContained.ATTACK_KEY; }
// public void ATTACK_KEY(java.lang.String value) { wrapperContained.ATTACK_KEY = value; }
// public static java.lang.String ATTACK_KEY() { return net.minecraft.entity.decoration.InteractionEntity.ATTACK_KEY; }
// public static void ATTACK_KEY(java.lang.String value, ) { net.minecraft.entity.decoration.InteractionEntity.ATTACK_KEY = value; }

// public java.lang.String INTERACTION_KEY() { return wrapperContained.INTERACTION_KEY; }
// public void INTERACTION_KEY(java.lang.String value) { wrapperContained.INTERACTION_KEY = value; }
// public static java.lang.String INTERACTION_KEY() { return net.minecraft.entity.decoration.InteractionEntity.INTERACTION_KEY; }
// public static void INTERACTION_KEY(java.lang.String value, ) { net.minecraft.entity.decoration.InteractionEntity.INTERACTION_KEY = value; }

// public java.lang.String RESPONSE_KEY() { return wrapperContained.RESPONSE_KEY; }
// public void RESPONSE_KEY(java.lang.String value) { wrapperContained.RESPONSE_KEY = value; }
// public static java.lang.String RESPONSE_KEY() { return net.minecraft.entity.decoration.InteractionEntity.RESPONSE_KEY; }
// public static void RESPONSE_KEY(java.lang.String value, ) { net.minecraft.entity.decoration.InteractionEntity.RESPONSE_KEY = value; }

// public Object attack() { return wrapperContained.attack; }
// // public void attack(Object value) { wrapperContained.attack = value; }
// // public static Object attack() { return net.minecraft.entity.decoration.InteractionEntity.attack; }
// // public static void attack(Object value, ) { net.minecraft.entity.decoration.InteractionEntity.attack = value; }

// public Object interaction() { return wrapperContained.interaction; }
// // public void interaction(Object value) { wrapperContained.interaction = value; }
// // public static Object interaction() { return net.minecraft.entity.decoration.InteractionEntity.interaction; }
// // public static void interaction(Object value, ) { net.minecraft.entity.decoration.InteractionEntity.interaction = value; }

public void setInteractionWidth(float width) { wrapperContained.setInteractionWidth(width); }
// public static void setInteractionWidth(float width, ) { net.minecraft.entity.decoration.InteractionEntity.setInteractionWidth(width); }
// public void method_49110(com.mojang.datafixers.util.Pair pair) { wrapperContained.method_49110(pair); }
// public static void method_49110(com.mojang.datafixers.util.Pair pair, ) { net.minecraft.entity.decoration.InteractionEntity.method_49110(pair); }
public void setResponse(boolean response) { wrapperContained.setResponse(response); }
// public static void setResponse(boolean response, ) { net.minecraft.entity.decoration.InteractionEntity.setResponse(response); }
public void setInteractionHeight(float height) { wrapperContained.setInteractionHeight(height); }
// public static void setInteractionHeight(float height, ) { net.minecraft.entity.decoration.InteractionEntity.setInteractionHeight(height); }
// public void method_49114(com.mojang.datafixers.util.Pair pair) { wrapperContained.method_49114(pair); }
// public static void method_49114(com.mojang.datafixers.util.Pair pair, ) { net.minecraft.entity.decoration.InteractionEntity.method_49114(pair); }
public float getInteractionWidth() { return wrapperContained.getInteractionWidth(); }
// public static float getInteractionWidth() { return net.minecraft.entity.decoration.InteractionEntity.getInteractionWidth(); }
public float getInteractionHeight() { return wrapperContained.getInteractionHeight(); }
// public static float getInteractionHeight() { return net.minecraft.entity.decoration.InteractionEntity.getInteractionHeight(); }
public boolean shouldRespond() { return wrapperContained.shouldRespond(); }
// public static boolean shouldRespond() { return net.minecraft.entity.decoration.InteractionEntity.shouldRespond(); }
// public yarnwrap.entity.EntityDimensions getDimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.getDimensions()); }
// public static yarnwrap.entity.EntityDimensions getDimensions() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.decoration.InteractionEntity.getDimensions()); }

}
package yarnwrap.predicate.entity;
public class InputPredicate { public net.minecraft.predicate.entity.InputPredicate wrapperContained; public InputPredicate(net.minecraft.predicate.entity.InputPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.InputPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.InputPredicate.CODEC = value; }

public boolean matches(yarnwrap.util.PlayerInput playerInput) { return wrapperContained.matches(playerInput.wrapperContained); }
// public static boolean matches(yarnwrap.util.PlayerInput playerInput, ) { return net.minecraft.predicate.entity.InputPredicate.matches(playerInput.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_63644(Object instance) { return wrapperContained.method_63644(instance); }
// public static com.mojang.datafixers.kinds.App method_63644(Object instance, ) { return net.minecraft.predicate.entity.InputPredicate.method_63644(instance); }
// public boolean keyMatches(java.util.Optional keyPressed,boolean inputPressed) { return wrapperContained.keyMatches(keyPressed,inputPressed); }
// public static boolean keyMatches(java.util.Optional keyPressed,boolean inputPressed, ) { return net.minecraft.predicate.entity.InputPredicate.keyMatches(keyPressed,inputPressed); }
// public java.lang.Boolean method_63646(boolean pressed) { return wrapperContained.method_63646(pressed); }
// public static java.lang.Boolean method_63646(boolean pressed, ) { return net.minecraft.predicate.entity.InputPredicate.method_63646(pressed); }

}
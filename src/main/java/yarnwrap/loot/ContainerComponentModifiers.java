package yarnwrap.loot;
public class ContainerComponentModifiers { public net.minecraft.loot.ContainerComponentModifiers wrapperContained; public ContainerComponentModifiers(net.minecraft.loot.ContainerComponentModifiers wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.ContainerComponentModifier CONTAINER() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.CONTAINER); }
// public void CONTAINER(yarnwrap.loot.ContainerComponentModifier value) { wrapperContained.CONTAINER = value.wrapperContained; }
public static yarnwrap.loot.ContainerComponentModifier CONTAINER() { return new yarnwrap.loot.ContainerComponentModifier(net.minecraft.loot.ContainerComponentModifiers.CONTAINER); }
// public static void CONTAINER(yarnwrap.loot.ContainerComponentModifier value, ) { net.minecraft.loot.ContainerComponentModifiers.CONTAINER = value.wrapperContained; }

// public yarnwrap.loot.ContainerComponentModifier BUNDLE_CONTENTS() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.BUNDLE_CONTENTS); }
// public void BUNDLE_CONTENTS(yarnwrap.loot.ContainerComponentModifier value) { wrapperContained.BUNDLE_CONTENTS = value.wrapperContained; }
public static yarnwrap.loot.ContainerComponentModifier BUNDLE_CONTENTS() { return new yarnwrap.loot.ContainerComponentModifier(net.minecraft.loot.ContainerComponentModifiers.BUNDLE_CONTENTS); }
// public static void BUNDLE_CONTENTS(yarnwrap.loot.ContainerComponentModifier value, ) { net.minecraft.loot.ContainerComponentModifiers.BUNDLE_CONTENTS = value.wrapperContained; }

// public yarnwrap.loot.ContainerComponentModifier CHARGED_PROJECTILES() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.CHARGED_PROJECTILES); }
// public void CHARGED_PROJECTILES(yarnwrap.loot.ContainerComponentModifier value) { wrapperContained.CHARGED_PROJECTILES = value.wrapperContained; }
public static yarnwrap.loot.ContainerComponentModifier CHARGED_PROJECTILES() { return new yarnwrap.loot.ContainerComponentModifier(net.minecraft.loot.ContainerComponentModifiers.CHARGED_PROJECTILES); }
// public static void CHARGED_PROJECTILES(yarnwrap.loot.ContainerComponentModifier value, ) { net.minecraft.loot.ContainerComponentModifiers.CHARGED_PROJECTILES = value.wrapperContained; }

// public java.util.Map TYPE_TO_MODIFIER() { return wrapperContained.TYPE_TO_MODIFIER; }
// public void TYPE_TO_MODIFIER(java.util.Map value) { wrapperContained.TYPE_TO_MODIFIER = value; }
public static java.util.Map TYPE_TO_MODIFIER() { return net.minecraft.loot.ContainerComponentModifiers.TYPE_TO_MODIFIER; }
// public static void TYPE_TO_MODIFIER(java.util.Map value, ) { net.minecraft.loot.ContainerComponentModifiers.TYPE_TO_MODIFIER = value; }

// public com.mojang.serialization.Codec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.Codec value) { wrapperContained.MODIFIER_CODEC = value; }
public static com.mojang.serialization.Codec MODIFIER_CODEC() { return net.minecraft.loot.ContainerComponentModifiers.MODIFIER_CODEC; }
// public static void MODIFIER_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.ContainerComponentModifiers.MODIFIER_CODEC = value; }

// public com.mojang.serialization.DataResult method_59729(yarnwrap.component.ComponentType componentType) { return wrapperContained.method_59729(componentType.wrapperContained); }
// public static com.mojang.serialization.DataResult method_59729(yarnwrap.component.ComponentType componentType, ) { return net.minecraft.loot.ContainerComponentModifiers.method_59729(componentType.wrapperContained); }

}
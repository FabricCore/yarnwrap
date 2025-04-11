package yarnwrap.loot;
public class ContainerComponentModifiers { public net.minecraft.loot.ContainerComponentModifiers wrapperContained; public ContainerComponentModifiers(net.minecraft.loot.ContainerComponentModifiers wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.ContainerComponentModifier CONTAINER() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.CONTAINER); }
// public void CONTAINER(yarnwrap.loot.ContainerComponentModifier value) { wrapperContained.CONTAINER = value.wrapperContained; }
public yarnwrap.loot.ContainerComponentModifier BUNDLE_CONTENTS() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.BUNDLE_CONTENTS); }
// public void BUNDLE_CONTENTS(yarnwrap.loot.ContainerComponentModifier value) { wrapperContained.BUNDLE_CONTENTS = value.wrapperContained; }
public yarnwrap.loot.ContainerComponentModifier CHARGED_PROJECTILES() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.CHARGED_PROJECTILES); }
// public void CHARGED_PROJECTILES(yarnwrap.loot.ContainerComponentModifier value) { wrapperContained.CHARGED_PROJECTILES = value.wrapperContained; }
public java.util.Map TYPE_TO_MODIFIER() { return wrapperContained.TYPE_TO_MODIFIER; }
// public void TYPE_TO_MODIFIER(java.util.Map value) { wrapperContained.TYPE_TO_MODIFIER = value; }
public com.mojang.serialization.Codec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.Codec value) { wrapperContained.MODIFIER_CODEC = value; }
// public com.mojang.serialization.DataResult method_59729(yarnwrap.component.ComponentType componentType) { return wrapperContained.method_59729(componentType.wrapperContained); }

}
package yarnwrap.loot;
public class ContainerComponentModifiers { public net.minecraft.loot.ContainerComponentModifiers wrapperContained; public ContainerComponentModifiers(net.minecraft.loot.ContainerComponentModifiers wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.ContainerComponentModifier CONTAINER() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.CONTAINER); }
public yarnwrap.loot.ContainerComponentModifier BUNDLE_CONTENTS() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.BUNDLE_CONTENTS); }
public yarnwrap.loot.ContainerComponentModifier CHARGED_PROJECTILES() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.CHARGED_PROJECTILES); }
public java.util.Map TYPE_TO_MODIFIER() { return wrapperContained.TYPE_TO_MODIFIER; }
public com.mojang.serialization.Codec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }

}
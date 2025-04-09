package yarnwrap.structure.rule.blockentity;
public class RuleBlockEntityModifier { public net.minecraft.structure.rule.blockentity.RuleBlockEntityModifier wrapperContained; public RuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.RuleBlockEntityModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
public yarnwrap.structure.rule.blockentity.RuleBlockEntityModifierType getType() { return new yarnwrap.structure.rule.blockentity.RuleBlockEntityModifierType(wrapperContained.getType()); }
public yarnwrap.nbt.NbtCompound modifyBlockEntityNbt(yarnwrap.util.math.random.Random random,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.modifyBlockEntityNbt(random.wrapperContained,nbt.wrapperContained)); }

}
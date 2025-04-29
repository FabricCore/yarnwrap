package yarnwrap.structure.rule.blockentity;
public class RuleBlockEntityModifier { public net.minecraft.structure.rule.blockentity.RuleBlockEntityModifier wrapperContained; public RuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.RuleBlockEntityModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public static com.mojang.serialization.Codec TYPE_CODEC() { return net.minecraft.structure.rule.blockentity.RuleBlockEntityModifier.TYPE_CODEC; }
// public static void TYPE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.structure.rule.blockentity.RuleBlockEntityModifier.TYPE_CODEC = value; }

public yarnwrap.structure.rule.blockentity.RuleBlockEntityModifierType getType() { return new yarnwrap.structure.rule.blockentity.RuleBlockEntityModifierType(wrapperContained.getType()); }
// public static yarnwrap.structure.rule.blockentity.RuleBlockEntityModifierType getType() { return new yarnwrap.structure.rule.blockentity.RuleBlockEntityModifierType(net.minecraft.structure.rule.blockentity.RuleBlockEntityModifier.getType()); }
public yarnwrap.nbt.NbtCompound modifyBlockEntityNbt(yarnwrap.util.math.random.Random random,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.modifyBlockEntityNbt(random.wrapperContained,nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound modifyBlockEntityNbt(yarnwrap.util.math.random.Random random,yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.structure.rule.blockentity.RuleBlockEntityModifier.modifyBlockEntityNbt(random.wrapperContained,nbt.wrapperContained)); }

}
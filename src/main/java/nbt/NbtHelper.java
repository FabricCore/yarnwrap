package yarnwrap.nbt;
public class NbtHelper { public net.minecraft.nbt.NbtHelper wrapperContained; public NbtHelper(net.minecraft.nbt.NbtHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Comparator BLOCK_POS_COMPARATOR() { return wrapperContained.BLOCK_POS_COMPARATOR; }
// public java.util.Comparator ENTITY_POS_COMPARATOR() { return wrapperContained.ENTITY_POS_COMPARATOR; }
// public com.google.common.base.Splitter COMMA_SPLITTER() { return wrapperContained.COMMA_SPLITTER; }
// public com.google.common.base.Splitter COLON_SPLITTER() { return wrapperContained.COLON_SPLITTER; }
public java.lang.String DATA_KEY() { return wrapperContained.DATA_KEY; }
// public char LEFT_CURLY_BRACKET() { return wrapperContained.LEFT_CURLY_BRACKET; }
// public char RIGHT_CURLY_BRACKET() { return wrapperContained.RIGHT_CURLY_BRACKET; }
// public java.lang.String COMMA() { return wrapperContained.COMMA; }
// public char COLON() { return wrapperContained.COLON; }
public yarnwrap.block.BlockState toBlockState(yarnwrap.registry.RegistryEntryLookup blockLookup,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.block.BlockState(wrapperContained.toBlockState(blockLookup.wrapperContained,nbt.wrapperContained)); }
// public yarnwrap.state.State withProperty(yarnwrap.state.State state,yarnwrap.state.property.Property property,java.lang.String key,yarnwrap.nbt.NbtCompound properties,yarnwrap.nbt.NbtCompound root) { return new yarnwrap.state.State(wrapperContained.withProperty(state.wrapperContained,property.wrapperContained,key,properties.wrapperContained,root.wrapperContained)); }
// public java.lang.String nameValue(yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.nameValue(property.wrapperContained,value); }
public yarnwrap.nbt.NbtCompound fromBlockState(yarnwrap.block.BlockState state) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromBlockState(state.wrapperContained)); }
public boolean matches(yarnwrap.nbt.NbtElement standard,yarnwrap.nbt.NbtElement subject,boolean ignoreListOrder) { return wrapperContained.matches(standard.wrapperContained,subject.wrapperContained,ignoreListOrder); }
public java.util.Optional toBlockPos(yarnwrap.nbt.NbtCompound nbt,java.lang.String key) { return wrapperContained.toBlockPos(nbt.wrapperContained,key); }
public yarnwrap.nbt.NbtElement fromBlockPos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.nbt.NbtElement(wrapperContained.fromBlockPos(pos.wrapperContained)); }
public yarnwrap.nbt.NbtIntArray fromUuid(java.util.UUID uuid) { return new yarnwrap.nbt.NbtIntArray(wrapperContained.fromUuid(uuid)); }
public java.util.UUID toUuid(yarnwrap.nbt.NbtElement element) { return wrapperContained.toUuid(element.wrapperContained); }
// public yarnwrap.nbt.NbtCompound fromNbtProviderString(java.lang.String string) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromNbtProviderString(string)); }
// public yarnwrap.nbt.NbtCompound fromNbtProviderFormattedPalette(java.lang.String string) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromNbtProviderFormattedPalette(string)); }
public yarnwrap.text.Text toPrettyPrintedText(yarnwrap.nbt.NbtElement element) { return new yarnwrap.text.Text(wrapperContained.toPrettyPrintedText(element.wrapperContained)); }
public java.lang.String toNbtProviderString(yarnwrap.nbt.NbtCompound compound) { return wrapperContained.toNbtProviderString(compound.wrapperContained); }
// public yarnwrap.nbt.NbtCompound toNbtProviderFormat(yarnwrap.nbt.NbtCompound compound) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbtProviderFormat(compound.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound fromNbtProviderFormat(yarnwrap.nbt.NbtCompound compound) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromNbtProviderFormat(compound.wrapperContained)); }
// public java.lang.String toNbtProviderFormattedPalette(yarnwrap.nbt.NbtCompound compound) { return wrapperContained.toNbtProviderFormattedPalette(compound.wrapperContained); }
// public java.lang.StringBuilder appendIndent(int depth,java.lang.StringBuilder stringBuilder) { return wrapperContained.appendIndent(depth,stringBuilder); }
public yarnwrap.nbt.NbtCompound fromFluidState(yarnwrap.fluid.FluidState state) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromFluidState(state.wrapperContained)); }
public java.lang.StringBuilder appendFormattedString(java.lang.StringBuilder stringBuilder,yarnwrap.nbt.NbtElement nbt,int depth,boolean withArrayContents) { return wrapperContained.appendFormattedString(stringBuilder,nbt.wrapperContained,depth,withArrayContents); }
public java.lang.String toFormattedString(yarnwrap.nbt.NbtElement nbt,boolean withArrayContents) { return wrapperContained.toFormattedString(nbt.wrapperContained,withArrayContents); }
public java.lang.String toFormattedString(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.toFormattedString(nbt.wrapperContained); }
public yarnwrap.nbt.NbtCompound putDataVersion(yarnwrap.nbt.NbtCompound nbt,int dataVersion) { return new yarnwrap.nbt.NbtCompound(wrapperContained.putDataVersion(nbt.wrapperContained,dataVersion)); }
public int getDataVersion(yarnwrap.nbt.NbtCompound nbt,int fallback) { return wrapperContained.getDataVersion(nbt.wrapperContained,fallback); }
public yarnwrap.nbt.NbtCompound putDataVersion(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.putDataVersion(nbt.wrapperContained)); }

}
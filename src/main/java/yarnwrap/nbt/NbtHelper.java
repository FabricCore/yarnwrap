package yarnwrap.nbt;
public class NbtHelper { public net.minecraft.nbt.NbtHelper wrapperContained; public NbtHelper(net.minecraft.nbt.NbtHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Comparator BLOCK_POS_COMPARATOR() { return wrapperContained.BLOCK_POS_COMPARATOR; }
// public void BLOCK_POS_COMPARATOR(java.util.Comparator value) { wrapperContained.BLOCK_POS_COMPARATOR = value; }
// public java.util.Comparator ENTITY_POS_COMPARATOR() { return wrapperContained.ENTITY_POS_COMPARATOR; }
// public void ENTITY_POS_COMPARATOR(java.util.Comparator value) { wrapperContained.ENTITY_POS_COMPARATOR = value; }
// public com.google.common.base.Splitter COMMA_SPLITTER() { return wrapperContained.COMMA_SPLITTER; }
// public void COMMA_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COMMA_SPLITTER = value; }
// public com.google.common.base.Splitter COLON_SPLITTER() { return wrapperContained.COLON_SPLITTER; }
// public void COLON_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COLON_SPLITTER = value; }
public java.lang.String DATA_KEY() { return wrapperContained.DATA_KEY; }
// public void DATA_KEY(java.lang.String value) { wrapperContained.DATA_KEY = value; }
// public char LEFT_CURLY_BRACKET() { return wrapperContained.LEFT_CURLY_BRACKET; }
// public void LEFT_CURLY_BRACKET(char value) { wrapperContained.LEFT_CURLY_BRACKET = value; }
// public char RIGHT_CURLY_BRACKET() { return wrapperContained.RIGHT_CURLY_BRACKET; }
// public void RIGHT_CURLY_BRACKET(char value) { wrapperContained.RIGHT_CURLY_BRACKET = value; }
// public java.lang.String COMMA() { return wrapperContained.COMMA; }
// public void COMMA(java.lang.String value) { wrapperContained.COMMA = value; }
// public char COLON() { return wrapperContained.COLON; }
// public void COLON(char value) { wrapperContained.COLON = value; }
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
// public yarnwrap.nbt.NbtList method_32261(java.util.Map nbt) { return new yarnwrap.nbt.NbtList(wrapperContained.method_32261(nbt)); }
// public java.lang.String method_32262(yarnwrap.nbt.NbtCompound key) { return wrapperContained.method_32262(key.wrapperContained); }
// public void method_32263(yarnwrap.nbt.NbtCompound property) { wrapperContained.method_32263(property.wrapperContained); }
// public double method_32264(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32264(nbt.wrapperContained); }
// public void method_32265(yarnwrap.nbt.NbtList nbt) { wrapperContained.method_32265(nbt.wrapperContained); }
// public void method_32266(yarnwrap.nbt.NbtList nbt) { wrapperContained.method_32266(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound fromNbtProviderFormattedPalette(java.lang.String string) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromNbtProviderFormattedPalette(string)); }
// public double method_32268(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32268(nbt.wrapperContained); }
// public double method_32269(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32269(nbt.wrapperContained); }
public yarnwrap.text.Text toPrettyPrintedText(yarnwrap.nbt.NbtElement element) { return new yarnwrap.text.Text(wrapperContained.toPrettyPrintedText(element.wrapperContained)); }
public java.lang.String toNbtProviderString(yarnwrap.nbt.NbtCompound compound) { return wrapperContained.toNbtProviderString(compound.wrapperContained); }
// public int method_32272(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32272(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound toNbtProviderFormat(yarnwrap.nbt.NbtCompound compound) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbtProviderFormat(compound.wrapperContained)); }
// public int method_32274(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32274(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound fromNbtProviderFormat(yarnwrap.nbt.NbtCompound compound) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromNbtProviderFormat(compound.wrapperContained)); }
// public int method_32276(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32276(nbt.wrapperContained); }
// public java.lang.String toNbtProviderFormattedPalette(yarnwrap.nbt.NbtCompound compound) { return wrapperContained.toNbtProviderFormattedPalette(compound.wrapperContained); }
// public yarnwrap.nbt.NbtList method_32278(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtList(wrapperContained.method_32278(nbt.wrapperContained)); }
// public yarnwrap.nbt.NbtList method_32279(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtList(wrapperContained.method_32279(nbt.wrapperContained)); }
// public java.lang.StringBuilder appendIndent(int depth,java.lang.StringBuilder stringBuilder) { return wrapperContained.appendIndent(depth,stringBuilder); }
public yarnwrap.nbt.NbtCompound fromFluidState(yarnwrap.fluid.FluidState state) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromFluidState(state.wrapperContained)); }
public java.lang.StringBuilder appendFormattedString(java.lang.StringBuilder stringBuilder,yarnwrap.nbt.NbtElement nbt,int depth,boolean withArrayContents) { return wrapperContained.appendFormattedString(stringBuilder,nbt.wrapperContained,depth,withArrayContents); }
public java.lang.String toFormattedString(yarnwrap.nbt.NbtElement nbt,boolean withArrayContents) { return wrapperContained.toFormattedString(nbt.wrapperContained,withArrayContents); }
public java.lang.String toFormattedString(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.toFormattedString(nbt.wrapperContained); }
public yarnwrap.nbt.NbtCompound putDataVersion(yarnwrap.nbt.NbtCompound nbt,int dataVersion) { return new yarnwrap.nbt.NbtCompound(wrapperContained.putDataVersion(nbt.wrapperContained,dataVersion)); }
public int getDataVersion(yarnwrap.nbt.NbtCompound nbt,int fallback) { return wrapperContained.getDataVersion(nbt.wrapperContained,fallback); }
public yarnwrap.nbt.NbtCompound putDataVersion(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.putDataVersion(nbt.wrapperContained)); }

}
package yarnwrap.nbt;
public class NbtHelper { public net.minecraft.nbt.NbtHelper wrapperContained; public NbtHelper(net.minecraft.nbt.NbtHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.nbt.NbtHelper.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.nbt.NbtHelper.LOGGER = value; }

// public java.util.Comparator BLOCK_POS_COMPARATOR() { return wrapperContained.BLOCK_POS_COMPARATOR; }
// public void BLOCK_POS_COMPARATOR(java.util.Comparator value) { wrapperContained.BLOCK_POS_COMPARATOR = value; }
// public static java.util.Comparator BLOCK_POS_COMPARATOR() { return net.minecraft.nbt.NbtHelper.BLOCK_POS_COMPARATOR; }
// public static void BLOCK_POS_COMPARATOR(java.util.Comparator value, ) { net.minecraft.nbt.NbtHelper.BLOCK_POS_COMPARATOR = value; }

// public java.util.Comparator ENTITY_POS_COMPARATOR() { return wrapperContained.ENTITY_POS_COMPARATOR; }
// public void ENTITY_POS_COMPARATOR(java.util.Comparator value) { wrapperContained.ENTITY_POS_COMPARATOR = value; }
// public static java.util.Comparator ENTITY_POS_COMPARATOR() { return net.minecraft.nbt.NbtHelper.ENTITY_POS_COMPARATOR; }
// public static void ENTITY_POS_COMPARATOR(java.util.Comparator value, ) { net.minecraft.nbt.NbtHelper.ENTITY_POS_COMPARATOR = value; }

// public com.google.common.base.Splitter COMMA_SPLITTER() { return wrapperContained.COMMA_SPLITTER; }
// public void COMMA_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COMMA_SPLITTER = value; }
// public static com.google.common.base.Splitter COMMA_SPLITTER() { return net.minecraft.nbt.NbtHelper.COMMA_SPLITTER; }
// public static void COMMA_SPLITTER(com.google.common.base.Splitter value, ) { net.minecraft.nbt.NbtHelper.COMMA_SPLITTER = value; }

// public com.google.common.base.Splitter COLON_SPLITTER() { return wrapperContained.COLON_SPLITTER; }
// public void COLON_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COLON_SPLITTER = value; }
// public static com.google.common.base.Splitter COLON_SPLITTER() { return net.minecraft.nbt.NbtHelper.COLON_SPLITTER; }
// public static void COLON_SPLITTER(com.google.common.base.Splitter value, ) { net.minecraft.nbt.NbtHelper.COLON_SPLITTER = value; }

// public java.lang.String DATA_KEY() { return wrapperContained.DATA_KEY; }
// public void DATA_KEY(java.lang.String value) { wrapperContained.DATA_KEY = value; }
public static java.lang.String DATA_KEY() { return net.minecraft.nbt.NbtHelper.DATA_KEY; }
// public static void DATA_KEY(java.lang.String value, ) { net.minecraft.nbt.NbtHelper.DATA_KEY = value; }

// public char LEFT_CURLY_BRACKET() { return wrapperContained.LEFT_CURLY_BRACKET; }
// public void LEFT_CURLY_BRACKET(char value) { wrapperContained.LEFT_CURLY_BRACKET = value; }
// public static char LEFT_CURLY_BRACKET() { return net.minecraft.nbt.NbtHelper.LEFT_CURLY_BRACKET; }
// public static void LEFT_CURLY_BRACKET(char value, ) { net.minecraft.nbt.NbtHelper.LEFT_CURLY_BRACKET = value; }

// public char RIGHT_CURLY_BRACKET() { return wrapperContained.RIGHT_CURLY_BRACKET; }
// public void RIGHT_CURLY_BRACKET(char value) { wrapperContained.RIGHT_CURLY_BRACKET = value; }
// public static char RIGHT_CURLY_BRACKET() { return net.minecraft.nbt.NbtHelper.RIGHT_CURLY_BRACKET; }
// public static void RIGHT_CURLY_BRACKET(char value, ) { net.minecraft.nbt.NbtHelper.RIGHT_CURLY_BRACKET = value; }

// public java.lang.String COMMA() { return wrapperContained.COMMA; }
// public void COMMA(java.lang.String value) { wrapperContained.COMMA = value; }
// public static java.lang.String COMMA() { return net.minecraft.nbt.NbtHelper.COMMA; }
// public static void COMMA(java.lang.String value, ) { net.minecraft.nbt.NbtHelper.COMMA = value; }

// public char COLON() { return wrapperContained.COLON; }
// public void COLON(char value) { wrapperContained.COLON = value; }
// public static char COLON() { return net.minecraft.nbt.NbtHelper.COLON; }
// public static void COLON(char value, ) { net.minecraft.nbt.NbtHelper.COLON = value; }

// public com.mojang.serialization.Codec BLOCK_KEY_CODEC() { return wrapperContained.BLOCK_KEY_CODEC; }
// public void BLOCK_KEY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BLOCK_KEY_CODEC = value; }
// public static com.mojang.serialization.Codec BLOCK_KEY_CODEC() { return net.minecraft.nbt.NbtHelper.BLOCK_KEY_CODEC; }
// public static void BLOCK_KEY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.nbt.NbtHelper.BLOCK_KEY_CODEC = value; }

// public yarnwrap.block.BlockState toBlockState(yarnwrap.registry.RegistryEntryLookup blockLookup,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.block.BlockState(wrapperContained.toBlockState(blockLookup.wrapperContained,nbt.wrapperContained)); }
// public static yarnwrap.block.BlockState toBlockState(yarnwrap.registry.RegistryEntryLookup blockLookup,yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.block.BlockState(net.minecraft.nbt.NbtHelper.toBlockState(blockLookup.wrapperContained,nbt.wrapperContained)); }
// public yarnwrap.state.State withProperty(yarnwrap.state.State state,yarnwrap.state.property.Property property,java.lang.String key,yarnwrap.nbt.NbtCompound properties,yarnwrap.nbt.NbtCompound root) { return new yarnwrap.state.State(wrapperContained.withProperty(state.wrapperContained,property.wrapperContained,key,properties.wrapperContained,root.wrapperContained)); }
// public static yarnwrap.state.State withProperty(yarnwrap.state.State state,yarnwrap.state.property.Property property,java.lang.String key,yarnwrap.nbt.NbtCompound properties,yarnwrap.nbt.NbtCompound root, ) { return new yarnwrap.state.State(net.minecraft.nbt.NbtHelper.withProperty(state.wrapperContained,property.wrapperContained,key,properties.wrapperContained,root.wrapperContained)); }
// public java.lang.String nameValue(yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.nameValue(property.wrapperContained,value); }
// public static java.lang.String nameValue(yarnwrap.state.property.Property property,java.lang.Comparable value, ) { return net.minecraft.nbt.NbtHelper.nameValue(property.wrapperContained,value); }
// public yarnwrap.nbt.NbtCompound fromBlockState(yarnwrap.block.BlockState state) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromBlockState(state.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound fromBlockState(yarnwrap.block.BlockState state, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtHelper.fromBlockState(state.wrapperContained)); }
// public boolean matches(yarnwrap.nbt.NbtElement standard,yarnwrap.nbt.NbtElement subject,boolean ignoreListOrder) { return wrapperContained.matches(standard.wrapperContained,subject.wrapperContained,ignoreListOrder); }
// public static boolean matches(yarnwrap.nbt.NbtElement standard,yarnwrap.nbt.NbtElement subject,boolean ignoreListOrder, ) { return net.minecraft.nbt.NbtHelper.matches(standard.wrapperContained,subject.wrapperContained,ignoreListOrder); }
// public yarnwrap.nbt.NbtCompound fromNbtProviderString(java.lang.String string) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromNbtProviderString(string)); }
// public static yarnwrap.nbt.NbtCompound fromNbtProviderString(java.lang.String string, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtHelper.fromNbtProviderString(string)); }
// public yarnwrap.nbt.NbtList method_32261(java.util.Map nbt) { return new yarnwrap.nbt.NbtList(wrapperContained.method_32261(nbt)); }
// public static yarnwrap.nbt.NbtList method_32261(java.util.Map nbt, ) { return new yarnwrap.nbt.NbtList(net.minecraft.nbt.NbtHelper.method_32261(nbt)); }
// public void method_32262(java.lang.StringBuilder properties) { wrapperContained.method_32262(properties); }
// public static void method_32262(java.lang.StringBuilder properties, ) { net.minecraft.nbt.NbtHelper.method_32262(properties); }
// public void method_32263(yarnwrap.nbt.NbtCompound property) { wrapperContained.method_32263(property.wrapperContained); }
// public static void method_32263(yarnwrap.nbt.NbtCompound property, ) { net.minecraft.nbt.NbtHelper.method_32263(property.wrapperContained); }
// public double method_32264(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32264(nbt.wrapperContained); }
// public static double method_32264(yarnwrap.nbt.NbtList nbt, ) { return net.minecraft.nbt.NbtHelper.method_32264(nbt.wrapperContained); }
// public void method_32265(yarnwrap.nbt.NbtList nbt) { wrapperContained.method_32265(nbt.wrapperContained); }
// public static void method_32265(yarnwrap.nbt.NbtList nbt, ) { net.minecraft.nbt.NbtHelper.method_32265(nbt.wrapperContained); }
// public void method_32266(yarnwrap.nbt.NbtList nbt) { wrapperContained.method_32266(nbt.wrapperContained); }
// public static void method_32266(yarnwrap.nbt.NbtList nbt, ) { net.minecraft.nbt.NbtHelper.method_32266(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound fromNbtProviderFormattedPalette(java.lang.String string) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromNbtProviderFormattedPalette(string)); }
// public static yarnwrap.nbt.NbtCompound fromNbtProviderFormattedPalette(java.lang.String string, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtHelper.fromNbtProviderFormattedPalette(string)); }
// public double method_32268(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32268(nbt.wrapperContained); }
// public static double method_32268(yarnwrap.nbt.NbtList nbt, ) { return net.minecraft.nbt.NbtHelper.method_32268(nbt.wrapperContained); }
// public double method_32269(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32269(nbt.wrapperContained); }
// public static double method_32269(yarnwrap.nbt.NbtList nbt, ) { return net.minecraft.nbt.NbtHelper.method_32269(nbt.wrapperContained); }
// public yarnwrap.text.Text toPrettyPrintedText(yarnwrap.nbt.NbtElement element) { return new yarnwrap.text.Text(wrapperContained.toPrettyPrintedText(element.wrapperContained)); }
// public static yarnwrap.text.Text toPrettyPrintedText(yarnwrap.nbt.NbtElement element, ) { return new yarnwrap.text.Text(net.minecraft.nbt.NbtHelper.toPrettyPrintedText(element.wrapperContained)); }
// public java.lang.String toNbtProviderString(yarnwrap.nbt.NbtCompound compound) { return wrapperContained.toNbtProviderString(compound.wrapperContained); }
// public static java.lang.String toNbtProviderString(yarnwrap.nbt.NbtCompound compound, ) { return net.minecraft.nbt.NbtHelper.toNbtProviderString(compound.wrapperContained); }
// public int method_32272(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32272(nbt.wrapperContained); }
// public static int method_32272(yarnwrap.nbt.NbtList nbt, ) { return net.minecraft.nbt.NbtHelper.method_32272(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound toNbtProviderFormat(yarnwrap.nbt.NbtCompound compound) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbtProviderFormat(compound.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound toNbtProviderFormat(yarnwrap.nbt.NbtCompound compound, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtHelper.toNbtProviderFormat(compound.wrapperContained)); }
// public int method_32274(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32274(nbt.wrapperContained); }
// public static int method_32274(yarnwrap.nbt.NbtList nbt, ) { return net.minecraft.nbt.NbtHelper.method_32274(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound fromNbtProviderFormat(yarnwrap.nbt.NbtCompound compound) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromNbtProviderFormat(compound.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound fromNbtProviderFormat(yarnwrap.nbt.NbtCompound compound, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtHelper.fromNbtProviderFormat(compound.wrapperContained)); }
// public int method_32276(yarnwrap.nbt.NbtList nbt) { return wrapperContained.method_32276(nbt.wrapperContained); }
// public static int method_32276(yarnwrap.nbt.NbtList nbt, ) { return net.minecraft.nbt.NbtHelper.method_32276(nbt.wrapperContained); }
// public java.lang.String toNbtProviderFormattedPalette(yarnwrap.nbt.NbtCompound compound) { return wrapperContained.toNbtProviderFormattedPalette(compound.wrapperContained); }
// public static java.lang.String toNbtProviderFormattedPalette(yarnwrap.nbt.NbtCompound compound, ) { return net.minecraft.nbt.NbtHelper.toNbtProviderFormattedPalette(compound.wrapperContained); }
// public java.util.Optional method_32278(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.method_32278(nbt.wrapperContained); }
// public static java.util.Optional method_32278(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.nbt.NbtHelper.method_32278(nbt.wrapperContained); }
// public java.util.Optional method_32279(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.method_32279(nbt.wrapperContained); }
// public static java.util.Optional method_32279(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.nbt.NbtHelper.method_32279(nbt.wrapperContained); }
// public java.lang.StringBuilder appendIndent(int depth,java.lang.StringBuilder stringBuilder) { return wrapperContained.appendIndent(depth,stringBuilder); }
// public static java.lang.StringBuilder appendIndent(int depth,java.lang.StringBuilder stringBuilder, ) { return net.minecraft.nbt.NbtHelper.appendIndent(depth,stringBuilder); }
// public yarnwrap.nbt.NbtCompound fromFluidState(yarnwrap.fluid.FluidState state) { return new yarnwrap.nbt.NbtCompound(wrapperContained.fromFluidState(state.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound fromFluidState(yarnwrap.fluid.FluidState state, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtHelper.fromFluidState(state.wrapperContained)); }
// public java.lang.StringBuilder appendFormattedString(java.lang.StringBuilder stringBuilder,yarnwrap.nbt.NbtElement nbt,int depth,boolean withArrayContents) { return wrapperContained.appendFormattedString(stringBuilder,nbt.wrapperContained,depth,withArrayContents); }
// public static java.lang.StringBuilder appendFormattedString(java.lang.StringBuilder stringBuilder,yarnwrap.nbt.NbtElement nbt,int depth,boolean withArrayContents, ) { return net.minecraft.nbt.NbtHelper.appendFormattedString(stringBuilder,nbt.wrapperContained,depth,withArrayContents); }
// public java.lang.String toFormattedString(yarnwrap.nbt.NbtElement nbt,boolean withArrayContents) { return wrapperContained.toFormattedString(nbt.wrapperContained,withArrayContents); }
// public static java.lang.String toFormattedString(yarnwrap.nbt.NbtElement nbt,boolean withArrayContents, ) { return net.minecraft.nbt.NbtHelper.toFormattedString(nbt.wrapperContained,withArrayContents); }
// public java.lang.String toFormattedString(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.toFormattedString(nbt.wrapperContained); }
// public static java.lang.String toFormattedString(yarnwrap.nbt.NbtElement nbt, ) { return net.minecraft.nbt.NbtHelper.toFormattedString(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound putDataVersion(yarnwrap.nbt.NbtCompound nbt,int dataVersion) { return new yarnwrap.nbt.NbtCompound(wrapperContained.putDataVersion(nbt.wrapperContained,dataVersion)); }
// public static yarnwrap.nbt.NbtCompound putDataVersion(yarnwrap.nbt.NbtCompound nbt,int dataVersion, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtHelper.putDataVersion(nbt.wrapperContained,dataVersion)); }
// public int getDataVersion(yarnwrap.nbt.NbtCompound nbt,int fallback) { return wrapperContained.getDataVersion(nbt.wrapperContained,fallback); }
// public static int getDataVersion(yarnwrap.nbt.NbtCompound nbt,int fallback, ) { return net.minecraft.nbt.NbtHelper.getDataVersion(nbt.wrapperContained,fallback); }
// public yarnwrap.nbt.NbtCompound putDataVersion(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.putDataVersion(nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound putDataVersion(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtHelper.putDataVersion(nbt.wrapperContained)); }
// public int getDataVersion(com.mojang.serialization.Dynamic dynamic,int fallback) { return wrapperContained.getDataVersion(dynamic,fallback); }
// public static int getDataVersion(com.mojang.serialization.Dynamic dynamic,int fallback, ) { return net.minecraft.nbt.NbtHelper.getDataVersion(dynamic,fallback); }
// public java.lang.String method_68595(Object entry) { return wrapperContained.method_68595(entry); }
// public static java.lang.String method_68595(Object entry, ) { return net.minecraft.nbt.NbtHelper.method_68595(entry); }
// public java.lang.String method_68596(yarnwrap.nbt.NbtCompound key) { return wrapperContained.method_68596(key.wrapperContained); }
// public static java.lang.String method_68596(yarnwrap.nbt.NbtCompound key, ) { return net.minecraft.nbt.NbtHelper.method_68596(key.wrapperContained); }
// public java.util.stream.Stream method_68597(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.method_68597(nbt.wrapperContained); }
// public static java.util.stream.Stream method_68597(yarnwrap.nbt.NbtElement nbt, ) { return net.minecraft.nbt.NbtHelper.method_68597(nbt.wrapperContained); }
// public java.util.stream.Stream method_68598(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.method_68598(nbt.wrapperContained); }
// public static java.util.stream.Stream method_68598(yarnwrap.nbt.NbtElement nbt, ) { return net.minecraft.nbt.NbtHelper.method_68598(nbt.wrapperContained); }
// public void writeDataVersion(yarnwrap.storage.WriteView view) { wrapperContained.writeDataVersion(view.wrapperContained); }
// public static void writeDataVersion(yarnwrap.storage.WriteView view, ) { net.minecraft.nbt.NbtHelper.writeDataVersion(view.wrapperContained); }
// public void writeDataVersion(yarnwrap.storage.WriteView view,int dataVersion) { wrapperContained.writeDataVersion(view.wrapperContained,dataVersion); }
// public static void writeDataVersion(yarnwrap.storage.WriteView view,int dataVersion, ) { net.minecraft.nbt.NbtHelper.writeDataVersion(view.wrapperContained,dataVersion); }

}
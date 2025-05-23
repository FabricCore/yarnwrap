package yarnwrap.test;
public class TestInstance { public net.minecraft.test.TestInstance wrapperContained; public TestInstance(net.minecraft.test.TestInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestData data() { return new yarnwrap.test.TestData(wrapperContained.data); }
// public void data(yarnwrap.test.TestData value) { wrapperContained.data = value.wrapperContained; }
// public static yarnwrap.test.TestData data() { return new yarnwrap.test.TestData(net.minecraft.test.TestInstance.data); }
// public static void data(yarnwrap.test.TestData value, ) { net.minecraft.test.TestInstance.data = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.test.TestInstance.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.test.TestInstance.CODEC = value; }

// public TestInstance(yarnwrap.test.TestData data) { this.wrapperContained = new net.minecraft.test.TestInstance(data.wrapperContained); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.test.TestInstance.getCodec(); }
public void start(yarnwrap.test.TestContext context) { wrapperContained.start(context.wrapperContained); }
// public static void start(yarnwrap.test.TestContext context, ) { net.minecraft.test.TestInstance.start(context.wrapperContained); }
// public yarnwrap.text.MutableText getTypeDescription() { return new yarnwrap.text.MutableText(wrapperContained.getTypeDescription()); }
// public static yarnwrap.text.MutableText getTypeDescription() { return new yarnwrap.text.MutableText(net.minecraft.test.TestInstance.getTypeDescription()); }
public yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(wrapperContained.getDescription()); }
// public static yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(net.minecraft.test.TestInstance.getDescription()); }
// public com.mojang.serialization.MapCodec method_66957(com.mojang.serialization.MapCodec codec) { return wrapperContained.method_66957(codec); }
// public static com.mojang.serialization.MapCodec method_66957(com.mojang.serialization.MapCodec codec, ) { return net.minecraft.test.TestInstance.method_66957(codec); }
// public yarnwrap.text.MutableText getFormattedDescription(java.lang.String key,java.lang.String description) { return new yarnwrap.text.MutableText(wrapperContained.getFormattedDescription(key,description)); }
// public static yarnwrap.text.MutableText getFormattedDescription(java.lang.String key,java.lang.String description, ) { return new yarnwrap.text.MutableText(net.minecraft.test.TestInstance.getFormattedDescription(key,description)); }
// public yarnwrap.text.MutableText getFormattedDescription(java.lang.String key,yarnwrap.text.MutableText description) { return new yarnwrap.text.MutableText(wrapperContained.getFormattedDescription(key,description.wrapperContained)); }
// public static yarnwrap.text.MutableText getFormattedDescription(java.lang.String key,yarnwrap.text.MutableText description, ) { return new yarnwrap.text.MutableText(net.minecraft.test.TestInstance.getFormattedDescription(key,description.wrapperContained)); }
// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.test.TestInstance.registerAndGetDefault(registry.wrapperContained); }
// public com.mojang.serialization.MapCodec register(yarnwrap.registry.Registry registry,java.lang.String id,com.mojang.serialization.MapCodec codec) { return wrapperContained.register(registry.wrapperContained,id,codec); }
// public static com.mojang.serialization.MapCodec register(yarnwrap.registry.Registry registry,java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return net.minecraft.test.TestInstance.register(registry.wrapperContained,id,codec); }
public yarnwrap.registry.entry.RegistryEntry getEnvironment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getEnvironment()); }
// public static yarnwrap.registry.entry.RegistryEntry getEnvironment() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.test.TestInstance.getEnvironment()); }
public yarnwrap.util.Identifier getStructure() { return new yarnwrap.util.Identifier(wrapperContained.getStructure()); }
// public static yarnwrap.util.Identifier getStructure() { return new yarnwrap.util.Identifier(net.minecraft.test.TestInstance.getStructure()); }
public int getMaxTicks() { return wrapperContained.getMaxTicks(); }
// public static int getMaxTicks() { return net.minecraft.test.TestInstance.getMaxTicks(); }
public int getSetupTicks() { return wrapperContained.getSetupTicks(); }
// public static int getSetupTicks() { return net.minecraft.test.TestInstance.getSetupTicks(); }
public boolean isRequired() { return wrapperContained.isRequired(); }
// public static boolean isRequired() { return net.minecraft.test.TestInstance.isRequired(); }
public boolean isManualOnly() { return wrapperContained.isManualOnly(); }
// public static boolean isManualOnly() { return net.minecraft.test.TestInstance.isManualOnly(); }
public int getMaxAttempts() { return wrapperContained.getMaxAttempts(); }
// public static int getMaxAttempts() { return net.minecraft.test.TestInstance.getMaxAttempts(); }
public int getRequiredSuccesses() { return wrapperContained.getRequiredSuccesses(); }
// public static int getRequiredSuccesses() { return net.minecraft.test.TestInstance.getRequiredSuccesses(); }
public boolean requiresSkyAccess() { return wrapperContained.requiresSkyAccess(); }
// public static boolean requiresSkyAccess() { return net.minecraft.test.TestInstance.requiresSkyAccess(); }
public yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation()); }
// public static yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(net.minecraft.test.TestInstance.getRotation()); }
// public yarnwrap.test.TestData getData() { return new yarnwrap.test.TestData(wrapperContained.getData()); }
// public static yarnwrap.test.TestData getData() { return new yarnwrap.test.TestData(net.minecraft.test.TestInstance.getData()); }
// public yarnwrap.text.MutableText getFormattedTypeDescription() { return new yarnwrap.text.MutableText(wrapperContained.getFormattedTypeDescription()); }
// public static yarnwrap.text.MutableText getFormattedTypeDescription() { return new yarnwrap.text.MutableText(net.minecraft.test.TestInstance.getFormattedTypeDescription()); }
// public yarnwrap.text.Text getStructureAndBatchDescription() { return new yarnwrap.text.Text(wrapperContained.getStructureAndBatchDescription()); }
// public static yarnwrap.text.Text getStructureAndBatchDescription() { return new yarnwrap.text.Text(net.minecraft.test.TestInstance.getStructureAndBatchDescription()); }

}
package yarnwrap.server.dedicated;
public class AbstractPropertiesHandler { public net.minecraft.server.dedicated.AbstractPropertiesHandler wrapperContained; public AbstractPropertiesHandler(net.minecraft.server.dedicated.AbstractPropertiesHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Properties properties() { return wrapperContained.properties; }
// public void properties(java.util.Properties value) { wrapperContained.properties = value; }
// public static java.util.Properties properties() { return net.minecraft.server.dedicated.AbstractPropertiesHandler.properties; }
// public static void properties(java.util.Properties value, ) { net.minecraft.server.dedicated.AbstractPropertiesHandler.properties = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.dedicated.AbstractPropertiesHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.dedicated.AbstractPropertiesHandler.LOGGER = value; }

// public AbstractPropertiesHandler(java.util.Properties properties) { this.wrapperContained = new net.minecraft.server.dedicated.AbstractPropertiesHandler(properties); }
// public int transformedParseInt(java.lang.String key,java.util.function.UnaryOperator transformer,int fallback) { return wrapperContained.transformedParseInt(key,transformer,fallback); }
// public static int transformedParseInt(java.lang.String key,java.util.function.UnaryOperator transformer,int fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.transformedParseInt(key,transformer,fallback); }
// public java.util.function.Function wrapNumberParser(java.util.function.Function parser) { return wrapperContained.wrapNumberParser(parser); }
// public static java.util.function.Function wrapNumberParser(java.util.function.Function parser, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.wrapNumberParser(parser); }
// public java.util.function.Function combineParser(java.util.function.IntFunction intParser,java.util.function.Function fallbackParser) { return wrapperContained.combineParser(intParser,fallbackParser); }
// public static java.util.function.Function combineParser(java.util.function.IntFunction intParser,java.util.function.Function fallbackParser, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.combineParser(intParser,fallbackParser); }
// public java.util.Properties copyProperties() { return wrapperContained.copyProperties(); }
// public static java.util.Properties copyProperties() { return net.minecraft.server.dedicated.AbstractPropertiesHandler.copyProperties(); }
// public Object accessor(java.lang.String key,java.util.function.Function parser,java.util.function.Function stringifier,java.lang.Object fallback) { return wrapperContained.accessor(key,parser,stringifier,fallback); }
// public static Object accessor(java.lang.String key,java.util.function.Function parser,java.util.function.Function stringifier,java.lang.Object fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.accessor(key,parser,stringifier,fallback); }
// public long parseLong(java.lang.String key,long fallback) { return wrapperContained.parseLong(key,fallback); }
// public static long parseLong(java.lang.String key,long fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.parseLong(key,fallback); }
// public int getInt(java.lang.String key,int fallback) { return wrapperContained.getInt(key,fallback); }
// public static int getInt(java.lang.String key,int fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.getInt(key,fallback); }
// public java.util.Properties loadProperties(java.nio.file.Path path) { return wrapperContained.loadProperties(path); }
// public static java.util.Properties loadProperties(java.nio.file.Path path, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.loadProperties(path); }
public void saveProperties(java.nio.file.Path path) { wrapperContained.saveProperties(path); }
// public static void saveProperties(java.nio.file.Path path, ) { net.minecraft.server.dedicated.AbstractPropertiesHandler.saveProperties(path); }
// public java.lang.Object method_16729(java.util.function.IntFunction string) { return wrapperContained.method_16729(string); }
// public static java.lang.Object method_16729(java.util.function.IntFunction string, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.method_16729(string); }
// public Object accessor(java.lang.String key,java.util.function.Function parser,java.lang.Object fallback) { return wrapperContained.accessor(key,parser,fallback); }
// public static Object accessor(java.lang.String key,java.util.function.Function parser,java.lang.Object fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.accessor(key,parser,fallback); }
// public java.lang.Object method_16731(java.util.function.Function value) { return wrapperContained.method_16731(value); }
// public static java.lang.Object method_16731(java.util.function.Function value, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.method_16731(value); }
// public java.lang.String getString(java.lang.String key,java.lang.String fallback) { return wrapperContained.getString(key,fallback); }
// public static java.lang.String getString(java.lang.String key,java.lang.String fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.getString(key,fallback); }
// public java.lang.Number method_16733(java.util.function.Function string) { return wrapperContained.method_16733(string); }
// public static java.lang.Number method_16733(java.util.function.Function string, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.method_16733(string); }
// public java.lang.String getStringValue(java.lang.String key) { return wrapperContained.getStringValue(key); }
// public static java.lang.String getStringValue(java.lang.String key, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.getStringValue(key); }
// public java.lang.Object get(java.lang.String key,java.util.function.Function parser,java.util.function.UnaryOperator parsedTransformer,java.util.function.Function stringifier,java.lang.Object fallback) { return wrapperContained.get(key,parser,parsedTransformer,stringifier,fallback); }
// public static java.lang.Object get(java.lang.String key,java.util.function.Function parser,java.util.function.UnaryOperator parsedTransformer,java.util.function.Function stringifier,java.lang.Object fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.get(key,parser,parsedTransformer,stringifier,fallback); }
// public java.lang.Boolean getDeprecatedBoolean(java.lang.String key) { return wrapperContained.getDeprecatedBoolean(key); }
// public static java.lang.Boolean getDeprecatedBoolean(java.lang.String key, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.getDeprecatedBoolean(key); }
// public java.lang.Object get(java.lang.String key,java.util.function.Function parser,java.lang.Object fallback) { return wrapperContained.get(key,parser,fallback); }
// public static java.lang.Object get(java.lang.String key,java.util.function.Function parser,java.lang.Object fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.get(key,parser,fallback); }
// public java.lang.String getDeprecatedString(java.lang.String key) { return wrapperContained.getDeprecatedString(key); }
// public static java.lang.String getDeprecatedString(java.lang.String key, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.getDeprecatedString(key); }
// public yarnwrap.server.dedicated.AbstractPropertiesHandler create(yarnwrap.registry.DynamicRegistryManager registryManager,java.util.Properties properties) { return new yarnwrap.server.dedicated.AbstractPropertiesHandler(wrapperContained.create(registryManager.wrapperContained,properties)); }
// public static yarnwrap.server.dedicated.AbstractPropertiesHandler create(yarnwrap.registry.DynamicRegistryManager registryManager,java.util.Properties properties, ) { return new yarnwrap.server.dedicated.AbstractPropertiesHandler(net.minecraft.server.dedicated.AbstractPropertiesHandler.create(registryManager.wrapperContained,properties)); }
// public boolean parseBoolean(java.lang.String key,boolean fallback) { return wrapperContained.parseBoolean(key,fallback); }
// public static boolean parseBoolean(java.lang.String key,boolean fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.parseBoolean(key,fallback); }
// public java.lang.Object get(java.lang.String key,java.util.function.Function parser,java.util.function.Function stringifier,java.lang.Object fallback) { return wrapperContained.get(key,parser,stringifier,fallback); }
// public static java.lang.Object get(java.lang.String key,java.util.function.Function parser,java.util.function.Function stringifier,java.lang.Object fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.get(key,parser,stringifier,fallback); }
// public java.lang.Object getDeprecated(java.lang.String key,java.util.function.Function stringifier) { return wrapperContained.getDeprecated(key,stringifier); }
// public static java.lang.Object getDeprecated(java.lang.String key,java.util.function.Function stringifier, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.getDeprecated(key,stringifier); }
// public Object intAccessor(java.lang.String key,int fallback) { return wrapperContained.intAccessor(key,fallback); }
// public static Object intAccessor(java.lang.String key,int fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.intAccessor(key,fallback); }
// public Object booleanAccessor(java.lang.String key,boolean fallback) { return wrapperContained.booleanAccessor(key,fallback); }
// public static Object booleanAccessor(java.lang.String key,boolean fallback, ) { return net.minecraft.server.dedicated.AbstractPropertiesHandler.booleanAccessor(key,fallback); }

}
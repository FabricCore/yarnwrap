package yarnwrap.server.dedicated;
public class AbstractPropertiesHandler { public net.minecraft.server.dedicated.AbstractPropertiesHandler wrapperContained; public AbstractPropertiesHandler(net.minecraft.server.dedicated.AbstractPropertiesHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Properties properties() { return wrapperContained.properties; }
// public void properties(java.util.Properties value) { wrapperContained.properties = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public AbstractPropertiesHandler(java.util.Properties properties) { this.wrapperContained = new net.minecraft.server.dedicated.AbstractPropertiesHandler(properties); }
// public int transformedParseInt(java.lang.String key,java.util.function.UnaryOperator transformer,int fallback) { return wrapperContained.transformedParseInt(key,transformer,fallback); }
// public java.util.function.Function wrapNumberParser(java.util.function.Function parser) { return wrapperContained.wrapNumberParser(parser); }
// public java.util.function.Function combineParser(java.util.function.IntFunction intParser,java.util.function.Function fallbackParser) { return wrapperContained.combineParser(intParser,fallbackParser); }
// public java.util.Properties copyProperties() { return wrapperContained.copyProperties(); }
// public Object accessor(java.lang.String key,java.util.function.Function parser,java.util.function.Function stringifier,java.lang.Object fallback) { return wrapperContained.accessor(key,parser,stringifier,fallback); }
// public long parseLong(java.lang.String key,long fallback) { return wrapperContained.parseLong(key,fallback); }
// public int getInt(java.lang.String key,int fallback) { return wrapperContained.getInt(key,fallback); }
public java.util.Properties loadProperties(java.nio.file.Path path) { return wrapperContained.loadProperties(path); }
public void saveProperties(java.nio.file.Path path) { wrapperContained.saveProperties(path); }
// public java.lang.Object method_16729(java.util.function.IntFunction string) { return wrapperContained.method_16729(string); }
// public Object accessor(java.lang.String key,java.util.function.Function parser,java.lang.Object fallback) { return wrapperContained.accessor(key,parser,fallback); }
// public java.lang.Object method_16731(java.util.function.Function value) { return wrapperContained.method_16731(value); }
// public java.lang.String getString(java.lang.String key,java.lang.String fallback) { return wrapperContained.getString(key,fallback); }
// public java.lang.Number method_16733(java.util.function.Function string) { return wrapperContained.method_16733(string); }
// public java.lang.String getStringValue(java.lang.String key) { return wrapperContained.getStringValue(key); }
// public java.lang.Object get(java.lang.String key,java.util.function.Function parser,java.util.function.UnaryOperator parsedTransformer,java.util.function.Function stringifier,java.lang.Object fallback) { return wrapperContained.get(key,parser,parsedTransformer,stringifier,fallback); }
// public java.lang.Boolean getDeprecatedBoolean(java.lang.String key) { return wrapperContained.getDeprecatedBoolean(key); }
// public java.lang.Object get(java.lang.String key,java.util.function.Function parser,java.lang.Object fallback) { return wrapperContained.get(key,parser,fallback); }
// public java.lang.String getDeprecatedString(java.lang.String key) { return wrapperContained.getDeprecatedString(key); }
// public yarnwrap.server.dedicated.AbstractPropertiesHandler create(yarnwrap.registry.DynamicRegistryManager registryManager,java.util.Properties properties) { return new yarnwrap.server.dedicated.AbstractPropertiesHandler(wrapperContained.create(registryManager.wrapperContained,properties)); }
// public boolean parseBoolean(java.lang.String key,boolean fallback) { return wrapperContained.parseBoolean(key,fallback); }
// public java.lang.Object get(java.lang.String key,java.util.function.Function parser,java.util.function.Function stringifier,java.lang.Object fallback) { return wrapperContained.get(key,parser,stringifier,fallback); }
// public java.lang.Object getDeprecated(java.lang.String key,java.util.function.Function stringifier) { return wrapperContained.getDeprecated(key,stringifier); }
// public Object intAccessor(java.lang.String key,int fallback) { return wrapperContained.intAccessor(key,fallback); }
// public Object booleanAccessor(java.lang.String key,boolean fallback) { return wrapperContained.booleanAccessor(key,fallback); }

}
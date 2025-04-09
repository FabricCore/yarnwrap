package yarnwrap.data.client;
public class PropertiesMap { public net.minecraft.data.client.PropertiesMap wrapperContained; public PropertiesMap(net.minecraft.data.client.PropertiesMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.client.PropertiesMap EMPTY() { return new yarnwrap.data.client.PropertiesMap(wrapperContained.EMPTY); }
// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public java.util.List values() { return wrapperContained.values; }
public yarnwrap.data.client.PropertiesMap empty() { return new yarnwrap.data.client.PropertiesMap(wrapperContained.empty()); }
// public yarnwrap.data.client.PropertiesMap withValue(Object value) { return new yarnwrap.data.client.PropertiesMap(wrapperContained.withValue(value)); }
public yarnwrap.data.client.PropertiesMap copyOf(yarnwrap.data.client.PropertiesMap propertiesMap) { return new yarnwrap.data.client.PropertiesMap(wrapperContained.copyOf(propertiesMap.wrapperContained)); }
// public yarnwrap.data.client.PropertiesMap withValues(Object[] values) { return new yarnwrap.data.client.PropertiesMap(wrapperContained.withValues(values)); }
public java.lang.String asString() { return wrapperContained.asString(); }

}
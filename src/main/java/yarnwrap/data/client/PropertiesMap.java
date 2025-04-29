package yarnwrap.data.client;
public class PropertiesMap { public net.minecraft.data.client.PropertiesMap wrapperContained; public PropertiesMap(net.minecraft.data.client.PropertiesMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.client.PropertiesMap EMPTY() { return new yarnwrap.data.client.PropertiesMap(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.data.client.PropertiesMap value) { wrapperContained.EMPTY = value.wrapperContained; }
// public static yarnwrap.data.client.PropertiesMap EMPTY() { return new yarnwrap.data.client.PropertiesMap(net.minecraft.data.client.PropertiesMap.EMPTY); }
// public static void EMPTY(yarnwrap.data.client.PropertiesMap value, ) { net.minecraft.data.client.PropertiesMap.EMPTY = value.wrapperContained; }

// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public void COMPARATOR(java.util.Comparator value) { wrapperContained.COMPARATOR = value; }
// public static java.util.Comparator COMPARATOR() { return net.minecraft.data.client.PropertiesMap.COMPARATOR; }
// public static void COMPARATOR(java.util.Comparator value, ) { net.minecraft.data.client.PropertiesMap.COMPARATOR = value; }

// public java.util.List values() { return wrapperContained.values; }
// public void values(java.util.List value) { wrapperContained.values = value; }
// public static java.util.List values() { return net.minecraft.data.client.PropertiesMap.values; }
// public static void values(java.util.List value, ) { net.minecraft.data.client.PropertiesMap.values = value; }

// public PropertiesMap(java.util.List values) { this.wrapperContained = new net.minecraft.data.client.PropertiesMap(values); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.data.client.PropertiesMap.equals(o); }
// public yarnwrap.data.client.PropertiesMap empty() { return new yarnwrap.data.client.PropertiesMap(wrapperContained.empty()); }
public static yarnwrap.data.client.PropertiesMap empty() { return new yarnwrap.data.client.PropertiesMap(net.minecraft.data.client.PropertiesMap.empty()); }
// public yarnwrap.data.client.PropertiesMap withValue(Object value) { return new yarnwrap.data.client.PropertiesMap(wrapperContained.withValue(value)); }
// public static yarnwrap.data.client.PropertiesMap withValue(Object value, ) { return new yarnwrap.data.client.PropertiesMap(net.minecraft.data.client.PropertiesMap.withValue(value)); }
public yarnwrap.data.client.PropertiesMap copyOf(yarnwrap.data.client.PropertiesMap propertiesMap) { return new yarnwrap.data.client.PropertiesMap(wrapperContained.copyOf(propertiesMap.wrapperContained)); }
// public static yarnwrap.data.client.PropertiesMap copyOf(yarnwrap.data.client.PropertiesMap propertiesMap, ) { return new yarnwrap.data.client.PropertiesMap(net.minecraft.data.client.PropertiesMap.copyOf(propertiesMap.wrapperContained)); }
// public yarnwrap.data.client.PropertiesMap withValues(Object[] values) { return new yarnwrap.data.client.PropertiesMap(wrapperContained.withValues(values)); }
// public static yarnwrap.data.client.PropertiesMap withValues(Object[] values, ) { return new yarnwrap.data.client.PropertiesMap(net.minecraft.data.client.PropertiesMap.withValues(values)); }
public java.lang.String asString() { return wrapperContained.asString(); }
// public static java.lang.String asString() { return net.minecraft.data.client.PropertiesMap.asString(); }
// public java.lang.String method_25823(Object value) { return wrapperContained.method_25823(value); }
// public static java.lang.String method_25823(Object value, ) { return net.minecraft.data.client.PropertiesMap.method_25823(value); }

}
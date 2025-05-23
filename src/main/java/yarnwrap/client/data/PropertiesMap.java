package yarnwrap.client.data;
public class PropertiesMap { public net.minecraft.client.data.PropertiesMap wrapperContained; public PropertiesMap(net.minecraft.client.data.PropertiesMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List values() { return wrapperContained.values; }
// public void values(java.util.List value) { wrapperContained.values = value; }
// public static java.util.List values() { return net.minecraft.client.data.PropertiesMap.values; }
// public static void values(java.util.List value, ) { net.minecraft.client.data.PropertiesMap.values = value; }

// public yarnwrap.client.data.PropertiesMap EMPTY() { return new yarnwrap.client.data.PropertiesMap(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.data.PropertiesMap value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.data.PropertiesMap EMPTY() { return new yarnwrap.client.data.PropertiesMap(net.minecraft.client.data.PropertiesMap.EMPTY); }
// public static void EMPTY(yarnwrap.client.data.PropertiesMap value, ) { net.minecraft.client.data.PropertiesMap.EMPTY = value.wrapperContained; }

// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public void COMPARATOR(java.util.Comparator value) { wrapperContained.COMPARATOR = value; }
// public static java.util.Comparator COMPARATOR() { return net.minecraft.client.data.PropertiesMap.COMPARATOR; }
// public static void COMPARATOR(java.util.Comparator value, ) { net.minecraft.client.data.PropertiesMap.COMPARATOR = value; }

public PropertiesMap(java.util.List values) { this.wrapperContained = new net.minecraft.client.data.PropertiesMap(values); }
// public java.util.List values() { return wrapperContained.values(); }
// // public static java.util.List values() { return net.minecraft.client.data.PropertiesMap.values(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.data.PropertiesMap.equals(o); }
// public yarnwrap.client.data.PropertiesMap withValue(Object value) { return new yarnwrap.client.data.PropertiesMap(wrapperContained.withValue(value)); }
// public static yarnwrap.client.data.PropertiesMap withValue(Object value, ) { return new yarnwrap.client.data.PropertiesMap(net.minecraft.client.data.PropertiesMap.withValue(value)); }
public yarnwrap.client.data.PropertiesMap copyOf(yarnwrap.client.data.PropertiesMap propertiesMap) { return new yarnwrap.client.data.PropertiesMap(wrapperContained.copyOf(propertiesMap.wrapperContained)); }
// public static yarnwrap.client.data.PropertiesMap copyOf(yarnwrap.client.data.PropertiesMap propertiesMap, ) { return new yarnwrap.client.data.PropertiesMap(net.minecraft.client.data.PropertiesMap.copyOf(propertiesMap.wrapperContained)); }
// public yarnwrap.client.data.PropertiesMap withValues(Object[] values) { return new yarnwrap.client.data.PropertiesMap(wrapperContained.withValues(values)); }
// public static yarnwrap.client.data.PropertiesMap withValues(Object[] values, ) { return new yarnwrap.client.data.PropertiesMap(net.minecraft.client.data.PropertiesMap.withValues(values)); }
public java.lang.String asString() { return wrapperContained.asString(); }
// public static java.lang.String asString() { return net.minecraft.client.data.PropertiesMap.asString(); }
// public java.lang.String method_25823(Object value) { return wrapperContained.method_25823(value); }
// public static java.lang.String method_25823(Object value, ) { return net.minecraft.client.data.PropertiesMap.method_25823(value); }

}
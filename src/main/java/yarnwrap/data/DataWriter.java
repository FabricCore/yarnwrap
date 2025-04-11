package yarnwrap.data;
public class DataWriter { public net.minecraft.data.DataWriter wrapperContained; public DataWriter(net.minecraft.data.DataWriter wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.data.DataWriter UNCACHED() { return new yarnwrap.data.DataWriter(wrapperContained.UNCACHED); }
// public void UNCACHED(yarnwrap.data.DataWriter value) { wrapperContained.UNCACHED = value.wrapperContained; }
// public void write(java.nio.file.Path path,byte data,com.google.common.hash.HashCode[] hashCode) { wrapperContained.write(path,data,hashCode); }
// public void method_44300(java.nio.file.Path path,byte data,com.google.common.hash.HashCode[] hashCode) { wrapperContained.method_44300(path,data,hashCode); }

}
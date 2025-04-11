package yarnwrap.util;
public class NetworkUtils { public net.minecraft.util.NetworkUtils wrapperContained; public NetworkUtils(net.minecraft.util.NetworkUtils wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public int findLocalPort() { return wrapperContained.findLocalPort(); }
public boolean isPortAvailable(int port) { return wrapperContained.isPortAvailable(port); }
// public com.google.common.hash.HashCode write(com.google.common.hash.HashFunction hashFunction,int maxBytes,Object listener,java.io.InputStream stream,java.nio.file.Path path) { return wrapperContained.write(hashFunction,maxBytes,listener,stream,path); }
// public java.nio.file.Path resolve(java.nio.file.Path path,com.google.common.hash.HashCode hashCode) { return wrapperContained.resolve(path,hashCode); }
// public com.google.common.hash.HashCode hash(java.nio.file.Path path,com.google.common.hash.HashFunction hashFunction) { return wrapperContained.hash(path,hashFunction); }
// public boolean validateHash(java.nio.file.Path path,com.google.common.hash.HashFunction hashFunction,com.google.common.hash.HashCode hashCode) { return wrapperContained.validateHash(path,hashFunction,hashCode); }
// public java.nio.file.Path download(java.nio.file.Path path,java.net.URL url,java.util.Map headers,com.google.common.hash.HashFunction hashFunction,com.google.common.hash.HashCode hashCode,int maxBytes,java.net.Proxy proxy,Object listener) { return wrapperContained.download(path,url,headers,hashFunction,hashCode,maxBytes,proxy,listener); }
// public void updateModificationTime(java.nio.file.Path path) { wrapperContained.updateModificationTime(path); }

}
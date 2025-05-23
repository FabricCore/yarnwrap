package yarnwrap.util.path;
public class PathResolving { public net.minecraft.util.path.PathResolving wrapperContained; public PathResolving(net.minecraft.util.path.PathResolving wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.path.PathResolving.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.path.PathResolving.LOGGER = value; }

// public java.nio.file.Path toPath(java.net.URI uri) { return wrapperContained.toPath(uri); }
// public static java.nio.file.Path toPath(java.net.URI uri, ) { return net.minecraft.util.path.PathResolving.toPath(uri); }

}
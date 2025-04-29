package yarnwrap.resource;
public class InputSupplier { public net.minecraft.resource.InputSupplier wrapperContained; public InputSupplier(net.minecraft.resource.InputSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.InputSupplier create(java.nio.file.Path path) { return new yarnwrap.resource.InputSupplier(wrapperContained.create(path)); }
// public static yarnwrap.resource.InputSupplier create(java.nio.file.Path path, ) { return new yarnwrap.resource.InputSupplier(net.minecraft.resource.InputSupplier.create(path)); }
// public yarnwrap.resource.InputSupplier create(java.util.zip.ZipFile zipFile,java.util.zip.ZipEntry zipEntry) { return new yarnwrap.resource.InputSupplier(wrapperContained.create(zipFile,zipEntry)); }
// public static yarnwrap.resource.InputSupplier create(java.util.zip.ZipFile zipFile,java.util.zip.ZipEntry zipEntry, ) { return new yarnwrap.resource.InputSupplier(net.minecraft.resource.InputSupplier.create(zipFile,zipEntry)); }

}
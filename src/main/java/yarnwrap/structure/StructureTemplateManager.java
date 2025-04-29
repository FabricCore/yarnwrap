package yarnwrap.structure;
public class StructureTemplateManager { public net.minecraft.structure.StructureTemplateManager wrapperContained; public StructureTemplateManager(net.minecraft.structure.StructureTemplateManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path generatedPath() { return wrapperContained.generatedPath; }
// public void generatedPath(java.nio.file.Path value) { wrapperContained.generatedPath = value; }
// public static java.nio.file.Path generatedPath() { return net.minecraft.structure.StructureTemplateManager.generatedPath; }
// public static void generatedPath(java.nio.file.Path value, ) { net.minecraft.structure.StructureTemplateManager.generatedPath = value; }

// public java.util.Map templates() { return wrapperContained.templates; }
// public void templates(java.util.Map value) { wrapperContained.templates = value; }
// public static java.util.Map templates() { return net.minecraft.structure.StructureTemplateManager.templates; }
// public static void templates(java.util.Map value, ) { net.minecraft.structure.StructureTemplateManager.templates = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.structure.StructureTemplateManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.structure.StructureTemplateManager.LOGGER = value; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.structure.StructureTemplateManager.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.structure.StructureTemplateManager.dataFixer = value; }

// public yarnwrap.resource.ResourceManager resourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.resourceManager); }
// public void resourceManager(yarnwrap.resource.ResourceManager value) { wrapperContained.resourceManager = value.wrapperContained; }
// public static yarnwrap.resource.ResourceManager resourceManager() { return new yarnwrap.resource.ResourceManager(net.minecraft.structure.StructureTemplateManager.resourceManager); }
// public static void resourceManager(yarnwrap.resource.ResourceManager value, ) { net.minecraft.structure.StructureTemplateManager.resourceManager = value.wrapperContained; }

// public java.lang.String STRUCTURE_DIRECTORY() { return wrapperContained.STRUCTURE_DIRECTORY; }
// public void STRUCTURE_DIRECTORY(java.lang.String value) { wrapperContained.STRUCTURE_DIRECTORY = value; }
public static java.lang.String STRUCTURE_DIRECTORY() { return net.minecraft.structure.StructureTemplateManager.STRUCTURE_DIRECTORY; }
// public static void STRUCTURE_DIRECTORY(java.lang.String value, ) { net.minecraft.structure.StructureTemplateManager.STRUCTURE_DIRECTORY = value; }

// public java.lang.String NBT_FILE_EXTENSION() { return wrapperContained.NBT_FILE_EXTENSION; }
// public void NBT_FILE_EXTENSION(java.lang.String value) { wrapperContained.NBT_FILE_EXTENSION = value; }
// public static java.lang.String NBT_FILE_EXTENSION() { return net.minecraft.structure.StructureTemplateManager.NBT_FILE_EXTENSION; }
// public static void NBT_FILE_EXTENSION(java.lang.String value, ) { net.minecraft.structure.StructureTemplateManager.NBT_FILE_EXTENSION = value; }

// public java.lang.String SNBT_FILE_EXTENSION() { return wrapperContained.SNBT_FILE_EXTENSION; }
// public void SNBT_FILE_EXTENSION(java.lang.String value) { wrapperContained.SNBT_FILE_EXTENSION = value; }
// public static java.lang.String SNBT_FILE_EXTENSION() { return net.minecraft.structure.StructureTemplateManager.SNBT_FILE_EXTENSION; }
// public static void SNBT_FILE_EXTENSION(java.lang.String value, ) { net.minecraft.structure.StructureTemplateManager.SNBT_FILE_EXTENSION = value; }

// public java.util.List providers() { return wrapperContained.providers; }
// public void providers(java.util.List value) { wrapperContained.providers = value; }
// public static java.util.List providers() { return net.minecraft.structure.StructureTemplateManager.providers; }
// public static void providers(java.util.List value, ) { net.minecraft.structure.StructureTemplateManager.providers = value; }

// public yarnwrap.registry.RegistryEntryLookup blockLookup() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.blockLookup); }
// public void blockLookup(yarnwrap.registry.RegistryEntryLookup value) { wrapperContained.blockLookup = value.wrapperContained; }
// public static yarnwrap.registry.RegistryEntryLookup blockLookup() { return new yarnwrap.registry.RegistryEntryLookup(net.minecraft.structure.StructureTemplateManager.blockLookup); }
// public static void blockLookup(yarnwrap.registry.RegistryEntryLookup value, ) { net.minecraft.structure.StructureTemplateManager.blockLookup = value.wrapperContained; }

// public java.lang.String STRUCTURES_DIRECTORY() { return wrapperContained.STRUCTURES_DIRECTORY; }
// public void STRUCTURES_DIRECTORY(java.lang.String value) { wrapperContained.STRUCTURES_DIRECTORY = value; }
// public static java.lang.String STRUCTURES_DIRECTORY() { return net.minecraft.structure.StructureTemplateManager.STRUCTURES_DIRECTORY; }
// public static void STRUCTURES_DIRECTORY(java.lang.String value, ) { net.minecraft.structure.StructureTemplateManager.STRUCTURES_DIRECTORY = value; }

// public yarnwrap.resource.ResourceFinder STRUCTURE_NBT_RESOURCE_FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.STRUCTURE_NBT_RESOURCE_FINDER); }
// public void STRUCTURE_NBT_RESOURCE_FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.STRUCTURE_NBT_RESOURCE_FINDER = value.wrapperContained; }
// public static yarnwrap.resource.ResourceFinder STRUCTURE_NBT_RESOURCE_FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.structure.StructureTemplateManager.STRUCTURE_NBT_RESOURCE_FINDER); }
// public static void STRUCTURE_NBT_RESOURCE_FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.structure.StructureTemplateManager.STRUCTURE_NBT_RESOURCE_FINDER = value.wrapperContained; }

// public StructureTemplateManager(yarnwrap.resource.ResourceManager resourceManager,Object session,com.mojang.datafixers.DataFixer dataFixer,yarnwrap.registry.RegistryEntryLookup blockLookup) { this.wrapperContained = new net.minecraft.structure.StructureTemplateManager(resourceManager.wrapperContained,session,dataFixer,blockLookup.wrapperContained); }
public java.nio.file.Path getTemplatePath(yarnwrap.util.Identifier id,java.lang.String extension) { return wrapperContained.getTemplatePath(id.wrapperContained,extension); }
// public static java.nio.file.Path getTemplatePath(yarnwrap.util.Identifier id,java.lang.String extension, ) { return net.minecraft.structure.StructureTemplateManager.getTemplatePath(id.wrapperContained,extension); }
public void unloadTemplate(yarnwrap.util.Identifier id) { wrapperContained.unloadTemplate(id.wrapperContained); }
// public static void unloadTemplate(yarnwrap.util.Identifier id, ) { net.minecraft.structure.StructureTemplateManager.unloadTemplate(id.wrapperContained); }
// public java.util.Optional loadTemplateFromResource(yarnwrap.util.Identifier id) { return wrapperContained.loadTemplateFromResource(id.wrapperContained); }
// public static java.util.Optional loadTemplateFromResource(yarnwrap.util.Identifier id, ) { return net.minecraft.structure.StructureTemplateManager.loadTemplateFromResource(id.wrapperContained); }
// public yarnwrap.structure.StructureTemplate readTemplate(java.io.InputStream templateIInputStream) { return new yarnwrap.structure.StructureTemplate(wrapperContained.readTemplate(templateIInputStream)); }
// public static yarnwrap.structure.StructureTemplate readTemplate(java.io.InputStream templateIInputStream, ) { return new yarnwrap.structure.StructureTemplate(net.minecraft.structure.StructureTemplateManager.readTemplate(templateIInputStream)); }
public yarnwrap.structure.StructureTemplate getTemplateOrBlank(yarnwrap.util.Identifier id) { return new yarnwrap.structure.StructureTemplate(wrapperContained.getTemplateOrBlank(id.wrapperContained)); }
// public static yarnwrap.structure.StructureTemplate getTemplateOrBlank(yarnwrap.util.Identifier id, ) { return new yarnwrap.structure.StructureTemplate(net.minecraft.structure.StructureTemplateManager.getTemplateOrBlank(id.wrapperContained)); }
// public java.util.Optional loadTemplateFromFile(yarnwrap.util.Identifier id) { return wrapperContained.loadTemplateFromFile(id.wrapperContained); }
// public static java.util.Optional loadTemplateFromFile(yarnwrap.util.Identifier id, ) { return net.minecraft.structure.StructureTemplateManager.loadTemplateFromFile(id.wrapperContained); }
public boolean saveTemplate(yarnwrap.util.Identifier id) { return wrapperContained.saveTemplate(id.wrapperContained); }
// public static boolean saveTemplate(yarnwrap.util.Identifier id, ) { return net.minecraft.structure.StructureTemplateManager.saveTemplate(id.wrapperContained); }
public java.util.Optional getTemplate(yarnwrap.util.Identifier id) { return wrapperContained.getTemplate(id.wrapperContained); }
// public static java.util.Optional getTemplate(yarnwrap.util.Identifier id, ) { return net.minecraft.structure.StructureTemplateManager.getTemplate(id.wrapperContained); }
public yarnwrap.structure.StructureTemplate createTemplate(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.structure.StructureTemplate(wrapperContained.createTemplate(nbt.wrapperContained)); }
// public static yarnwrap.structure.StructureTemplate createTemplate(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.structure.StructureTemplate(net.minecraft.structure.StructureTemplateManager.createTemplate(nbt.wrapperContained)); }
public void setResourceManager(yarnwrap.resource.ResourceManager resourceManager) { wrapperContained.setResourceManager(resourceManager.wrapperContained); }
// public static void setResourceManager(yarnwrap.resource.ResourceManager resourceManager, ) { net.minecraft.structure.StructureTemplateManager.setResourceManager(resourceManager.wrapperContained); }
public java.util.stream.Stream streamTemplates() { return wrapperContained.streamTemplates(); }
// public static java.util.stream.Stream streamTemplates() { return net.minecraft.structure.StructureTemplateManager.streamTemplates(); }
// public java.lang.String method_44227(int filename) { return wrapperContained.method_44227(filename); }
// public static java.lang.String method_44227(int filename, ) { return net.minecraft.structure.StructureTemplateManager.method_44227(filename); }
// public void method_44229(yarnwrap.util.Identifier throwable) { wrapperContained.method_44229(throwable.wrapperContained); }
// public static void method_44229(yarnwrap.util.Identifier throwable, ) { net.minecraft.structure.StructureTemplateManager.method_44229(throwable.wrapperContained); }
// public java.util.Optional loadTemplateFromSnbt(yarnwrap.util.Identifier id,java.nio.file.Path path) { return wrapperContained.loadTemplateFromSnbt(id.wrapperContained,path); }
// public static java.util.Optional loadTemplateFromSnbt(yarnwrap.util.Identifier id,java.nio.file.Path path, ) { return net.minecraft.structure.StructureTemplateManager.loadTemplateFromSnbt(id.wrapperContained,path); }
// public java.util.Optional loadTemplate(Object opener,java.util.function.Consumer exceptionConsumer) { return wrapperContained.loadTemplate(opener,exceptionConsumer); }
// public static java.util.Optional loadTemplate(Object opener,java.util.function.Consumer exceptionConsumer, ) { return net.minecraft.structure.StructureTemplateManager.loadTemplate(opener,exceptionConsumer); }
// public java.util.stream.Stream method_44232(Object provider) { return wrapperContained.method_44232(provider); }
// public static java.util.stream.Stream method_44232(Object provider, ) { return net.minecraft.structure.StructureTemplateManager.method_44232(provider); }
// public boolean method_44233(java.lang.String path,java.nio.file.Path attributes) { return wrapperContained.method_44233(path,attributes); }
// public static boolean method_44233(java.lang.String path,java.nio.file.Path attributes, ) { return net.minecraft.structure.StructureTemplateManager.method_44233(path,attributes); }
// public void streamTemplates(java.nio.file.Path directory,java.lang.String namespace,java.lang.String fileExtension,java.util.function.Consumer idConsumer) { wrapperContained.streamTemplates(directory,namespace,fileExtension,idConsumer); }
// public static void streamTemplates(java.nio.file.Path directory,java.lang.String namespace,java.lang.String fileExtension,java.util.function.Consumer idConsumer, ) { net.minecraft.structure.StructureTemplateManager.streamTemplates(directory,namespace,fileExtension,idConsumer); }
// public void method_44237(java.nio.file.Path throwable) { wrapperContained.method_44237(throwable); }
// public static void method_44237(java.nio.file.Path throwable, ) { net.minecraft.structure.StructureTemplateManager.method_44237(throwable); }
// public java.lang.String toRelativePath(java.nio.file.Path root,java.nio.file.Path path) { return wrapperContained.toRelativePath(root,path); }
// public static java.lang.String toRelativePath(java.nio.file.Path root,java.nio.file.Path path, ) { return net.minecraft.structure.StructureTemplateManager.toRelativePath(root,path); }
// public java.util.stream.Stream streamTemplatesFromResource() { return wrapperContained.streamTemplatesFromResource(); }
// public static java.util.stream.Stream streamTemplatesFromResource() { return net.minecraft.structure.StructureTemplateManager.streamTemplatesFromResource(); }
// public java.util.stream.Stream streamTemplatesFromGameTestFile() { return wrapperContained.streamTemplatesFromGameTestFile(); }
// public static java.util.stream.Stream streamTemplatesFromGameTestFile() { return net.minecraft.structure.StructureTemplateManager.streamTemplatesFromGameTestFile(); }
// public boolean method_44242(java.nio.file.Path path) { return wrapperContained.method_44242(path); }
// public static boolean method_44242(java.nio.file.Path path, ) { return net.minecraft.structure.StructureTemplateManager.method_44242(path); }
// public java.util.stream.Stream streamTemplatesFromFile() { return wrapperContained.streamTemplatesFromFile(); }
// public static java.util.stream.Stream streamTemplatesFromFile() { return net.minecraft.structure.StructureTemplateManager.streamTemplatesFromFile(); }
// public java.util.Optional loadTemplate(yarnwrap.util.Identifier id) { return wrapperContained.loadTemplate(id.wrapperContained); }
// public static java.util.Optional loadTemplate(yarnwrap.util.Identifier id, ) { return net.minecraft.structure.StructureTemplateManager.loadTemplate(id.wrapperContained); }
// public java.util.Optional loadTemplateFromGameTestFile(yarnwrap.util.Identifier id) { return wrapperContained.loadTemplateFromGameTestFile(id.wrapperContained); }
// public static java.util.Optional loadTemplateFromGameTestFile(yarnwrap.util.Identifier id, ) { return net.minecraft.structure.StructureTemplateManager.loadTemplateFromGameTestFile(id.wrapperContained); }
// public void method_61022(java.util.function.Consumer path) { wrapperContained.method_61022(path); }
// public static void method_61022(java.util.function.Consumer path, ) { net.minecraft.structure.StructureTemplateManager.method_61022(path); }

}
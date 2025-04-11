package yarnwrap.structure;
public class StructureTemplateManager { public net.minecraft.structure.StructureTemplateManager wrapperContained; public StructureTemplateManager(net.minecraft.structure.StructureTemplateManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path generatedPath() { return wrapperContained.generatedPath; }
// public void generatedPath(java.nio.file.Path value) { wrapperContained.generatedPath = value; }
// public java.util.Map templates() { return wrapperContained.templates; }
// public void templates(java.util.Map value) { wrapperContained.templates = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public yarnwrap.resource.ResourceManager resourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.resourceManager); }
// public void resourceManager(yarnwrap.resource.ResourceManager value) { wrapperContained.resourceManager = value.wrapperContained; }
public java.lang.String STRUCTURE_DIRECTORY() { return wrapperContained.STRUCTURE_DIRECTORY; }
// public void STRUCTURE_DIRECTORY(java.lang.String value) { wrapperContained.STRUCTURE_DIRECTORY = value; }
// public java.lang.String NBT_FILE_EXTENSION() { return wrapperContained.NBT_FILE_EXTENSION; }
// public void NBT_FILE_EXTENSION(java.lang.String value) { wrapperContained.NBT_FILE_EXTENSION = value; }
// public java.lang.String SNBT_FILE_EXTENSION() { return wrapperContained.SNBT_FILE_EXTENSION; }
// public void SNBT_FILE_EXTENSION(java.lang.String value) { wrapperContained.SNBT_FILE_EXTENSION = value; }
// public java.util.List providers() { return wrapperContained.providers; }
// public void providers(java.util.List value) { wrapperContained.providers = value; }
// public yarnwrap.registry.RegistryEntryLookup blockLookup() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.blockLookup); }
// public void blockLookup(yarnwrap.registry.RegistryEntryLookup value) { wrapperContained.blockLookup = value.wrapperContained; }
// public java.lang.String STRUCTURES_DIRECTORY() { return wrapperContained.STRUCTURES_DIRECTORY; }
// public void STRUCTURES_DIRECTORY(java.lang.String value) { wrapperContained.STRUCTURES_DIRECTORY = value; }
// public yarnwrap.resource.ResourceFinder STRUCTURE_NBT_RESOURCE_FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.STRUCTURE_NBT_RESOURCE_FINDER); }
// public void STRUCTURE_NBT_RESOURCE_FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.STRUCTURE_NBT_RESOURCE_FINDER = value.wrapperContained; }
// public StructureTemplateManager(yarnwrap.resource.ResourceManager resourceManager,Object session,com.mojang.datafixers.DataFixer dataFixer,yarnwrap.registry.RegistryEntryLookup blockLookup) { this.wrapperContained = new net.minecraft.structure.StructureTemplateManager(resourceManager.wrapperContained,session,dataFixer,blockLookup.wrapperContained); }
public java.nio.file.Path getTemplatePath(yarnwrap.util.Identifier id,java.lang.String extension) { return wrapperContained.getTemplatePath(id.wrapperContained,extension); }
public void unloadTemplate(yarnwrap.util.Identifier id) { wrapperContained.unloadTemplate(id.wrapperContained); }
// public java.util.Optional loadTemplateFromResource(yarnwrap.util.Identifier id) { return wrapperContained.loadTemplateFromResource(id.wrapperContained); }
// public yarnwrap.structure.StructureTemplate readTemplate(java.io.InputStream templateIInputStream) { return new yarnwrap.structure.StructureTemplate(wrapperContained.readTemplate(templateIInputStream)); }
public yarnwrap.structure.StructureTemplate getTemplateOrBlank(yarnwrap.util.Identifier id) { return new yarnwrap.structure.StructureTemplate(wrapperContained.getTemplateOrBlank(id.wrapperContained)); }
// public java.util.Optional loadTemplateFromFile(yarnwrap.util.Identifier id) { return wrapperContained.loadTemplateFromFile(id.wrapperContained); }
public boolean saveTemplate(yarnwrap.util.Identifier id) { return wrapperContained.saveTemplate(id.wrapperContained); }
public java.util.Optional getTemplate(yarnwrap.util.Identifier id) { return wrapperContained.getTemplate(id.wrapperContained); }
public yarnwrap.structure.StructureTemplate createTemplate(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.structure.StructureTemplate(wrapperContained.createTemplate(nbt.wrapperContained)); }
public void setResourceManager(yarnwrap.resource.ResourceManager resourceManager) { wrapperContained.setResourceManager(resourceManager.wrapperContained); }
public java.util.stream.Stream streamTemplates() { return wrapperContained.streamTemplates(); }
// public java.lang.String method_44227(int filename) { return wrapperContained.method_44227(filename); }
// public void method_44229(yarnwrap.util.Identifier throwable) { wrapperContained.method_44229(throwable.wrapperContained); }
// public java.util.Optional loadTemplateFromSnbt(yarnwrap.util.Identifier id,java.nio.file.Path path) { return wrapperContained.loadTemplateFromSnbt(id.wrapperContained,path); }
// public java.util.Optional loadTemplate(Object opener,java.util.function.Consumer exceptionConsumer) { return wrapperContained.loadTemplate(opener,exceptionConsumer); }
// public java.util.stream.Stream method_44232(Object provider) { return wrapperContained.method_44232(provider); }
// public boolean method_44233(java.lang.String path,java.nio.file.Path attributes) { return wrapperContained.method_44233(path,attributes); }
// public void streamTemplates(java.nio.file.Path directory,java.lang.String namespace,java.lang.String fileExtension,java.util.function.Consumer idConsumer) { wrapperContained.streamTemplates(directory,namespace,fileExtension,idConsumer); }
// public void method_44237(java.nio.file.Path throwable) { wrapperContained.method_44237(throwable); }
// public java.lang.String toRelativePath(java.nio.file.Path root,java.nio.file.Path path) { return wrapperContained.toRelativePath(root,path); }
// public java.util.stream.Stream streamTemplatesFromResource() { return wrapperContained.streamTemplatesFromResource(); }
// public java.util.stream.Stream streamTemplatesFromGameTestFile() { return wrapperContained.streamTemplatesFromGameTestFile(); }
// public boolean method_44242(java.nio.file.Path path) { return wrapperContained.method_44242(path); }
// public java.util.stream.Stream streamTemplatesFromFile() { return wrapperContained.streamTemplatesFromFile(); }
// public java.util.Optional loadTemplate(yarnwrap.util.Identifier id) { return wrapperContained.loadTemplate(id.wrapperContained); }
// public java.util.Optional loadTemplateFromGameTestFile(yarnwrap.util.Identifier id) { return wrapperContained.loadTemplateFromGameTestFile(id.wrapperContained); }
// public void method_61022(java.util.function.Consumer path) { wrapperContained.method_61022(path); }

}
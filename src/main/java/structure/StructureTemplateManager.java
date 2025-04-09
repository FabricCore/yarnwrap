package yarnwrap.structure;
public class StructureTemplateManager { public net.minecraft.structure.StructureTemplateManager wrapperContained; public StructureTemplateManager(net.minecraft.structure.StructureTemplateManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path generatedPath() { return wrapperContained.generatedPath; }
// public java.util.Map templates() { return wrapperContained.templates; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public yarnwrap.resource.ResourceManager resourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.resourceManager); }
public java.lang.String STRUCTURE_DIRECTORY() { return wrapperContained.STRUCTURE_DIRECTORY; }
// public java.lang.String NBT_FILE_EXTENSION() { return wrapperContained.NBT_FILE_EXTENSION; }
// public java.lang.String SNBT_FILE_EXTENSION() { return wrapperContained.SNBT_FILE_EXTENSION; }
// public java.util.List providers() { return wrapperContained.providers; }
// public yarnwrap.registry.RegistryEntryLookup blockLookup() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.blockLookup); }
// public java.lang.String STRUCTURES_DIRECTORY() { return wrapperContained.STRUCTURES_DIRECTORY; }
// public yarnwrap.resource.ResourceFinder STRUCTURE_NBT_RESOURCE_FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.STRUCTURE_NBT_RESOURCE_FINDER); }
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
// public java.util.Optional loadTemplateFromSnbt(yarnwrap.util.Identifier id,java.nio.file.Path path) { return wrapperContained.loadTemplateFromSnbt(id.wrapperContained,path); }
// public java.util.Optional loadTemplate(Object opener,java.util.function.Consumer exceptionConsumer) { return wrapperContained.loadTemplate(opener,exceptionConsumer); }
// public void streamTemplates(java.nio.file.Path directory,java.lang.String namespace,java.lang.String fileExtension,java.util.function.Consumer idConsumer) { wrapperContained.streamTemplates(directory,namespace,fileExtension,idConsumer); }
// public java.lang.String toRelativePath(java.nio.file.Path root,java.nio.file.Path path) { return wrapperContained.toRelativePath(root,path); }
// public java.util.stream.Stream streamTemplatesFromResource() { return wrapperContained.streamTemplatesFromResource(); }
// public java.util.stream.Stream streamTemplatesFromGameTestFile() { return wrapperContained.streamTemplatesFromGameTestFile(); }
// public java.util.stream.Stream streamTemplatesFromFile() { return wrapperContained.streamTemplatesFromFile(); }
// public java.util.Optional loadTemplate(yarnwrap.util.Identifier id) { return wrapperContained.loadTemplate(id.wrapperContained); }
// public java.util.Optional loadTemplateFromGameTestFile(yarnwrap.util.Identifier id) { return wrapperContained.loadTemplateFromGameTestFile(id.wrapperContained); }

}
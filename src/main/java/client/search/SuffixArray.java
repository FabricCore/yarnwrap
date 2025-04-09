package yarnwrap.client.search;
public class SuffixArray { public net.minecraft.client.search.SuffixArray wrapperContained; public SuffixArray(net.minecraft.client.search.SuffixArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxTextLength() { return wrapperContained.maxTextLength; }
// public java.util.List objects() { return wrapperContained.objects; }
// public it.unimi.dsi.fastutil.ints.IntList suffixIndexToObjectIndex() { return wrapperContained.suffixIndexToObjectIndex; }
// public it.unimi.dsi.fastutil.ints.IntList characters() { return wrapperContained.characters; }
// public it.unimi.dsi.fastutil.ints.IntList offsetInText() { return wrapperContained.offsetInText; }
// public boolean PRINT_ARRAY() { return wrapperContained.PRINT_ARRAY; }
// public boolean PRINT_COMPARISONS() { return wrapperContained.PRINT_COMPARISONS; }
// public it.unimi.dsi.fastutil.ints.IntList textStarts() { return wrapperContained.textStarts; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public java.util.List findAll(java.lang.String text) { return wrapperContained.findAll(text); }
// public int compare(java.lang.String string,int suffixIndex) { return wrapperContained.compare(string,suffixIndex); }
public void add(java.lang.Object object,java.lang.String text) { wrapperContained.add(object,text); }
public void build() { wrapperContained.build(); }
// public java.lang.String getDebugString(int suffixIndex) { return wrapperContained.getDebugString(suffixIndex); }
// public void printArray() { wrapperContained.printArray(); }

}
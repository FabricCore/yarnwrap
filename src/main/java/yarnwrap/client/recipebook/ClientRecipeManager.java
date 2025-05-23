package yarnwrap.client.recipebook;
public class ClientRecipeManager { public net.minecraft.client.recipebook.ClientRecipeManager wrapperContained; public ClientRecipeManager(net.minecraft.client.recipebook.ClientRecipeManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map propertySets() { return wrapperContained.propertySets; }
// public void propertySets(java.util.Map value) { wrapperContained.propertySets = value; }
// public static java.util.Map propertySets() { return net.minecraft.client.recipebook.ClientRecipeManager.propertySets; }
// public static void propertySets(java.util.Map value, ) { net.minecraft.client.recipebook.ClientRecipeManager.propertySets = value; }

// public Object recipes() { return wrapperContained.recipes; }
// // public void recipes(Object value) { wrapperContained.recipes = value; }
// // public static Object recipes() { return net.minecraft.client.recipebook.ClientRecipeManager.recipes; }
// // public static void recipes(Object value, ) { net.minecraft.client.recipebook.ClientRecipeManager.recipes = value; }

// public ClientRecipeManager(java.util.Map propertySets,Object recipes) { this.wrapperContained = new net.minecraft.client.recipebook.ClientRecipeManager(propertySets,recipes); }

}
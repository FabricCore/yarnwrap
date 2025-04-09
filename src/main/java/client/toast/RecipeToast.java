package yarnwrap.client.toast;
public class RecipeToast { public net.minecraft.client.toast.RecipeToast wrapperContained; public RecipeToast(net.minecraft.client.toast.RecipeToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List recipes() { return wrapperContained.recipes; }
// public boolean justUpdated() { return wrapperContained.justUpdated; }
// public long startTime() { return wrapperContained.startTime; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(wrapperContained.DESCRIPTION); }
// public long DEFAULT_DURATION_MS() { return wrapperContained.DEFAULT_DURATION_MS; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void addRecipes(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.addRecipes(recipe.wrapperContained); }
public void show(yarnwrap.client.toast.ToastManager manager,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.show(manager.wrapperContained,recipe.wrapperContained); }

}
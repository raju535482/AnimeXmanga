package com.rajuyadav.animexmanga.databinding;
import com.rajuyadav.animexmanga.R;
import com.rajuyadav.animexmanga.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MangaDetailsItemListBindingImpl extends MangaDetailsItemListBinding implements com.rajuyadav.animexmanga.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.manga_details_list_item_imgView, 1);
        sViewsWithIds.put(R.id.manga_details_list_item_txtView_pageNum, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MangaDetailsItemListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private MangaDetailsItemListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.rajuyadav.animexmanga.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainmodel == variableId) {
            setMainmodel((com.rajuyadav.animexmanga.viewmodel.MainViewModel) variable);
        }
        else if (BR.strArrayListImage == variableId) {
            setStrArrayListImage((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainmodel(@Nullable com.rajuyadav.animexmanga.viewmodel.MainViewModel Mainmodel) {
        this.mMainmodel = Mainmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mainmodel);
        super.requestRebind();
    }
    public void setStrArrayListImage(@Nullable java.lang.String StrArrayListImage) {
        this.mStrArrayListImage = StrArrayListImage;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.strArrayListImage);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.rajuyadav.animexmanga.viewmodel.MainViewModel mainmodel = mMainmodel;
        java.lang.String strArrayListImage = mStrArrayListImage;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // mainmodel != null
        boolean mainmodelJavaLangObjectNull = false;
        // mainmodel
        com.rajuyadav.animexmanga.viewmodel.MainViewModel mainmodel = mMainmodel;
        // strArrayListImage
        java.lang.String strArrayListImage = mStrArrayListImage;



        mainmodelJavaLangObjectNull = (mainmodel) != (null);
        if (mainmodelJavaLangObjectNull) {



            mainmodel.onDetailsItemClick(strArrayListImage);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainmodel
        flag 1 (0x2L): strArrayListImage
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
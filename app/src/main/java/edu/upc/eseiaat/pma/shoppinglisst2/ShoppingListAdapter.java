package edu.upc.eseiaat.pma.shoppinglist;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.util.List;

/**
 * Created by manuel.melquiades.ve on 23/10/2017.
 */

public class ShoppingListAdapter extends ArrayAdapter <ShoppingItem> {
    public ShoppingListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
        super(context, resource, objects);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //  necesito una pastilla para la pocicion tal...
        // converView es la pastilla resiclada

        View result = convertView;
        if (result == null){

            // si no hay pastilla resiclada hay que crear una nueva
            // si no hay usamos un inflador para optener una nueva

            LayoutInflater inflater = LayoutInflater.from(getContext());

            result = inflater.inflate(R.layout.shopping_item, null); //
        }

        CheckBox S_item = (CheckBox) result.findViewById(R.id.shop_item); // busco dentro de lo que he encontrado dentro de result

        // elemento de los datos en esa posicion

        ShoppingItem item_text = (ShoppingItem)getItem(position);

        S_item.setText(item_text.getText());

        S_item.setChecked(item_text.isCheck());

        return result;



    }


    // solo ponemos el constructor







}

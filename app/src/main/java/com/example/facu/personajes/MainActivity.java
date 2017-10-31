package com.example.facu.personajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, CheckBox.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox humano = findViewById(R.id.cbHumano);
        humano.setOnCheckedChangeListener(this);
        RadioGroup color = findViewById(R.id.rgColor);
        color.setOnCheckedChangeListener(this);
        Spinner miembros = findViewById(R.id.spNumeroDeMiembros);
        miembros.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        CheckBox humano = findViewById(R.id.cbHumano);
        RadioGroup color = findViewById(R.id.rgColor);
        ImageView personaje = findViewById(R.id.ivPersonaje);
        switch (position) {
            case 0:
                if (color.getCheckedRadioButtonId() == R.id.rbRojo) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_rojo_2;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_rojo_2;
                        personaje.setImageResource(imagen);
                        break;
                    }
                } else if (color.getCheckedRadioButtonId() == R.id.rbVerde) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_verde_2;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_verde_2;
                        personaje.setImageResource(imagen);
                        break;
                    }
                } else if (color.getCheckedRadioButtonId() == R.id.rbAzul) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_azul_2;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_azul_2;
                        personaje.setImageResource(imagen);
                        break;
                    }
                }
            case 1:
                if (color.getCheckedRadioButtonId() == R.id.rbRojo) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_rojo_4;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_rojo_4;
                        personaje.setImageResource(imagen);
                        break;
                    }
                } else if (color.getCheckedRadioButtonId() == R.id.rbVerde) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_verde_4;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_verde_4;
                        personaje.setImageResource(imagen);
                        break;
                    }
                } else if (color.getCheckedRadioButtonId() == R.id.rbAzul) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_azul_4;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_azul_4;
                        personaje.setImageResource(imagen);
                        break;
                    }
                }
            case 2:
                if (color.getCheckedRadioButtonId() == R.id.rbRojo) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_rojo_6;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_rojo_6;
                        personaje.setImageResource(imagen);
                        break;
                    }
                } else if (color.getCheckedRadioButtonId() == R.id.rbVerde) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_verde_6;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_verde_6;
                        personaje.setImageResource(imagen);
                        break;
                    }
                } else if (color.getCheckedRadioButtonId() == R.id.rbAzul) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_azul_6;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_azul_6;
                        personaje.setImageResource(imagen);
                        break;
                    }
                }
            case 3:
                if (color.getCheckedRadioButtonId() == R.id.rbRojo) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_rojo_8;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_rojo_8;
                        personaje.setImageResource(imagen);
                        break;
                    }
                } else if (color.getCheckedRadioButtonId() == R.id.rbVerde) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_verde_8;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_verde_8;
                        personaje.setImageResource(imagen);
                        break;
                    }
                } else if (color.getCheckedRadioButtonId() == R.id.rbAzul) {
                    if (humano.isChecked()) {
                        int imagen = R.drawable.humano_azul_8;
                        personaje.setImageResource(imagen);
                        break;
                    } else {
                        int imagen = R.drawable.nohumano_azul_8;
                        personaje.setImageResource(imagen);
                        break;
                    }
                }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this, "No ha seleccionado ninguna opcion", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        CheckBox humano = findViewById(R.id.cbHumano);
        RadioGroup color = findViewById(R.id.rgColor);
        Spinner miembros = findViewById(R.id.spNumeroDeMiembros);
        ImageView personaje = findViewById(R.id.ivPersonaje);
        if (humano.isChecked()) {
            if (color.getCheckedRadioButtonId() == R.id.rbRojo) {
                if (miembros.getSelectedItemPosition() == 0) {
                    int imagen = R.drawable.humano_rojo_2;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 1) {
                    int imagen = R.drawable.humano_rojo_4;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 2) {
                    int imagen = R.drawable.humano_rojo_6;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 3) {
                    int imagen = R.drawable.humano_rojo_8;
                    personaje.setImageResource(imagen);
                }
            } else if (color.getCheckedRadioButtonId() == R.id.rbVerde) {
                if (miembros.getSelectedItemPosition() == 0) {
                    int imagen = R.drawable.humano_verde_2;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 1) {
                    int imagen = R.drawable.humano_verde_4;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 2) {
                    int imagen = R.drawable.humano_verde_6;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 3) {
                    int imagen = R.drawable.humano_verde_8;
                    personaje.setImageResource(imagen);
                }
            } else if (color.getCheckedRadioButtonId() == R.id.rbAzul) {
                if (miembros.getSelectedItemPosition() == 0) {
                    int imagen = R.drawable.humano_azul_2;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 1) {
                    int imagen = R.drawable.humano_azul_4;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 2) {
                    int imagen = R.drawable.humano_azul_6;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 3) {
                    int imagen = R.drawable.humano_azul_8;
                    personaje.setImageResource(imagen);
                }
            }
        } else if (!humano.isChecked()) {
            if (color.getCheckedRadioButtonId() == R.id.rbRojo) {
                if (miembros.getSelectedItemPosition() == 0) {
                    int imagen = R.drawable.nohumano_rojo_2;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 1) {
                    int imagen = R.drawable.nohumano_rojo_4;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 2) {
                    int imagen = R.drawable.nohumano_rojo_6;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 3) {
                    int imagen = R.drawable.nohumano_rojo_8;
                    personaje.setImageResource(imagen);
                }
            } else if (color.getCheckedRadioButtonId() == R.id.rbVerde) {
                if (miembros.getSelectedItemPosition() == 0) {
                    int imagen = R.drawable.nohumano_verde_2;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 1) {
                    int imagen = R.drawable.nohumano_verde_4;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 2) {
                    int imagen = R.drawable.nohumano_verde_6;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 3) {
                    int imagen = R.drawable.nohumano_verde_8;
                    personaje.setImageResource(imagen);
                }
            } else if (color.getCheckedRadioButtonId() == R.id.rbAzul) {
                if (miembros.getSelectedItemPosition() == 0) {
                    int imagen = R.drawable.nohumano_azul_2;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 1) {
                    int imagen = R.drawable.nohumano_azul_4;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 2) {
                    int imagen = R.drawable.nohumano_azul_6;
                    personaje.setImageResource(imagen);
                } else if (miembros.getSelectedItemPosition() == 3) {
                    int imagen = R.drawable.nohumano_azul_8;
                    personaje.setImageResource(imagen);
                }
            }
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        CheckBox humano = findViewById(R.id.cbHumano);
        RadioGroup color = findViewById(R.id.rgColor);
        Spinner miembros = findViewById(R.id.spNumeroDeMiembros);
        ImageView personaje = findViewById(R.id.ivPersonaje);
        if (color.getCheckedRadioButtonId() == R.id.rbRojo) {
            if (miembros.getSelectedItemPosition() == 0) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_rojo_2;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_rojo_2;
                    personaje.setImageResource(imagen);
                }
            } else if (miembros.getSelectedItemPosition() == 1) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_rojo_4;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_rojo_4;
                    personaje.setImageResource(imagen);
                }
            } else if (miembros.getSelectedItemPosition() == 2) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_rojo_6;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_rojo_6;
                    personaje.setImageResource(imagen);
                }
            } else if (miembros.getSelectedItemPosition() == 3) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_rojo_8;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_rojo_8;
                    personaje.setImageResource(imagen);
                }
            }
        } else if (color.getCheckedRadioButtonId() == R.id.rbVerde) {
            if (miembros.getSelectedItemPosition() == 0) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_verde_2;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_verde_2;
                    personaje.setImageResource(imagen);
                }
            } else if (miembros.getSelectedItemPosition() == 1) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_verde_4;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_verde_4;
                    personaje.setImageResource(imagen);
                }
            } else if (miembros.getSelectedItemPosition() == 2) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_verde_6;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_verde_6;
                    personaje.setImageResource(imagen);
                }
            } else if (miembros.getSelectedItemPosition() == 3) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_verde_8;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_verde_8;
                    personaje.setImageResource(imagen);
                }
            }
        } else if (color.getCheckedRadioButtonId() == R.id.rbAzul) {
            if (miembros.getSelectedItemPosition() == 0) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_azul_2;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_azul_2;
                    personaje.setImageResource(imagen);
                }
            } else if (miembros.getSelectedItemPosition() == 1) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_azul_4;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_azul_4;
                    personaje.setImageResource(imagen);
                }
            } else if (miembros.getSelectedItemPosition() == 2) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_azul_6;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_azul_6;
                    personaje.setImageResource(imagen);
                }
            } else if (miembros.getSelectedItemPosition() == 3) {
                if (humano.isChecked()) {
                    int imagen = R.drawable.humano_azul_8;
                    personaje.setImageResource(imagen);
                } else {
                    int imagen = R.drawable.nohumano_azul_8;
                    personaje.setImageResource(imagen);
                }
            }
        }
    }
}

# Estilos e Temas

### Estilo

* **Definição**: estilização de um componente

* **Exemplo**

  * `styles.xml`

    ```xml
    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <style name="nome_do_estilo" parent="herdar_estilos">
            <item name="android:textColor">#00FF00</item>
        </style>
    </resources>
    ```

  * **Componente**

    ```xml
    <TextView
    style="@style/GreenText"
    ... />
    ```

### Tema

* **Definição**: estilização genérica do aplicativo
# ícones, strings.xml e themes.xml

### Ícones

* Ficam armazenados na pasta `res/mipmap`

* Ícones pode ser no formato PNG ou SVG

### `colors.xml`

* Armazena cores que pode ser utilizados em várias Views

* Importar uma do `colors.xml` em uma View: `"@color/<nome da color>"`

* Ao alterar uma cor no `colors.xml`, refletirá em todos as View que importam essa cor 

* **Exemplo**

  ```xml
  <?xml version="1.0" encoding="utf-8"?>
  <resources>
      <color name="purple_200">#FFBB86FC</color>
      <color name="purple_500">#FF6200EE</color>
      <color name="purple_700">#FF3700B3</color>
      <color name="teal_200">#FF03DAC5</color>
      <color name="teal_700">#FF018786</color>
      <color name="black">#FF000000</color>
      <color name="white">#FFFFFFFF</color>
  </resources>
  ```

### `strings.xml`

* Armazena qualquer tipo de texto

* A tradução, dos textos de um aplicativo, é feita a partir do conteúdo do arquivo `strings.xml` 

* Importar um texto do `strings.xml` em uma View: `"@string/<nome da string>"`

* **Evitar textos *hard coded***, e preferir a utilização de referências de textos do arquivo `strings.xml`

* **OBS**: a nomenclatura dos recursos de texto são feita a partir do seu conteúdo

* **Exemplo**

  ```xml
  <resources>
    <string name="app_name">IMC</string>
    <string name="hello_world">Hello World!</string>
    <string name="hello_radio_button">Olá radio button</string>
    <string name="hello_checkbox">Olá checkbox</string>
  </resources>
  ```

### `themes.xml`

* Armazena os temas do aplicativo

* **Exemplo**

  ```xml
  <resources xmlns:tools="http://schemas.android.com/tools">
      <!-- Base application theme. -->
      <style name="Theme.Calculadoraimc" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
          <!-- Primary brand color. -->
          <item name="colorPrimary">@color/purple_500</item>
          <item name="colorPrimaryVariant">@color/purple_700</item>
          <item name="colorOnPrimary">@color/white</item>
          <!-- Secondary brand color. -->
          <item name="colorSecondary">@color/teal_200</item>
          <item name="colorSecondaryVariant">@color/teal_700</item>
          <item name="colorOnSecondary">@color/black</item>
          <!-- Status bar color. -->
          <item name="android:statusBarColor" tools:targetApi="l">?attr/colorPrimaryVariant</item>
          <!-- Customize your theme here. -->
      </style>
  </resources>
  ```
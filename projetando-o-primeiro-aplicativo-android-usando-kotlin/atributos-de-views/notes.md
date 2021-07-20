# Atributos de Views


### Gravity VS Layout_gravity

* **Gravity**: organização dos componentes dentro do *parent layout* em relação a sua orientação na tela, ou seja, **define a gravidade dos "filhos" sobre o "pai"**

* **Layout_gravity**: manipulação, individual, da orientação dos componentes, ou seja, **define a gravidade do componente sobre o "pai"**

* **Exemplo**

  ```xml
  <LinearLayout
    ...
    android:gravity:"center" />
  ```

  ```xml
  <TextView
    ...
    android:layout_gravity="center" />
  ```

### margin VS padding

* **Margin**: espaçamento entre os componentes

  ![](https://i.stack.imgur.com/oVv4Q.jpg)

* **Padding**: espaçamento entre o conteúdo e "borda" do componente

  ![](https://i.stack.imgur.com/QZ17W.jpg)

### InputType e personalização de texto

* **[InputType](https://developer.android.com/reference/android/text/InputType)**: especificar o tipo de teclado e assim limitar o tipo de entrada

  > InputType do tipo `phone`
  ![](https://developer.android.com/images/ui/edittext-phone.png)

### Match_parent, wrap_content, dp, sp

* **Match_parent**: definir como tamanho de uma View a dimensão da tela do dispositivo

* **Wrap_content**: definir como tamanho de uma View o mínimo necessário, ou seja, o tamanho do seu conteúdo

* **dp e sp**: unidade de medida, respeitando a **proporção de 8**, ou seja, `8dp` / `16dp` / `24dp` / ...

  > Proporção de 8 é consistente e respeita os padrões de acessibilidade

### Visibility, backgroundColor, tint, tools, etc

* **Visibility**

  * **Valor "invisible"**: ocultar um componente

  * **Valor "gone"**: eliminar um componente

* **Tools**: visibilidade de componentes **apenas** no ambiente de desenvolvimento

* Mais atributos: [Developer Android](https://developer.android.com/reference/android/view/View#xml-attributes_1)

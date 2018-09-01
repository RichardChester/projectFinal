<template>


      <div>
          <input v-model = "message">
          <p v-bind:class="{active: which === 1}" @click="which = 1">AB</p>
          <p v-bind:class="{active: which === 2}" @click="which = 2">CD</p>
          <p v-bind:class="{active: which === 3}" @click="which = 3">EF</p>
          <h1> {{ message.toUpperCase() }}</h1>
      </div>



</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
      return {
          message: "Hello",
          which: 1
      }
  },
    methods: {
      f(str) {
          return str + this.x;
        }
    }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
    .active {
        background-color: aqua;
    }
</style>

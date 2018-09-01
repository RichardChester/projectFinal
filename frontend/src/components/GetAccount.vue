<template>


    <div>
        <table style="width:50%">
            <tr>
                <th>Firstname</th>
                <th><input v-model = "message"></th>
                <th><button type="submit" >Search</button></th>

            </tr>
            <tr>
                <th></th>
                <td></td>
                <td></td>
                <td><button type="button">Edit</button></td>
                <td><button type="button">Delete</button></td>
            </tr>
        </table>
    </div>



</template>

<script>
    export default {
        name: 'GetAccount',
        props: {
            msg: String
        },
        data() {
            return {
                message: "",
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
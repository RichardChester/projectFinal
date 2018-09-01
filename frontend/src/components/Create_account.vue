<template>
    <div>
        <table style="width:50%">
            <tr>
                <th>Firstname</th>
                <th><input v-model = "message"></th>

            </tr>
            <tr>
                <th>Lastname</th>
                <td><input v-model = "message"></td>

            </tr>
            <tr>
                <th>Account number</th>
                <td><input v-model = "message"></td>
            </tr>
        </table>
        <b-container class="m-auto">
        <button type="submit" >Submit</button>
        </b-container>
    </div>
</template>

<script>
    export default {
        name: 'Create_account',
        props: {
            msg: String
        },
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

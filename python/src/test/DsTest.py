import unittest

from src.ds.Ds import Ds


class DsTest(unittest.TestCase):

    def test_list_operation(self):
        ds = Ds()
        ds.list_operation()

    def test_dict_operation(self):
        ds = Ds()
        ds.dict_operation()

    def test_loop_operation(self):
        ds = Ds()
        ds.loops_operation()

    def test_files(self):
        ds = Ds()
        ds.files()


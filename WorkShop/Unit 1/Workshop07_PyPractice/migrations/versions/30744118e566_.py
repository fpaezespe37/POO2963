"""empty message

Revision ID: 30744118e566
Revises: 
Create Date: 2019-10-15 11:20:31.962733

"""
from alembic import op
import sqlalchemy as sa


# revision identifiers, used by Alembic.
revision = '30744118e566'
down_revision = None
branch_labels = None
depends_on = None


def upgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.create_table('students',
    sa.Column('_id', sa.Integer(), nullable=False),
    sa.Column('name', sa.String(length=50), nullable=False),
    sa.PrimaryKeyConstraint('_id')
    )
    # ### end Alembic commands ###


def downgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.drop_table('students')
    # ### end Alembic commands ###
